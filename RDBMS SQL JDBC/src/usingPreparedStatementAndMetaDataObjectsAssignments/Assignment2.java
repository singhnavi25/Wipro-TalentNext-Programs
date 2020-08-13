package usingPreparedStatementAndMetaDataObjectsAssignments;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment2 
{
	/*
	 * Inserting a record
	 * ABC International School wants to computerize students details. The school maintains a database of students in Oracle. 
	 * The student table contains information related to students and is shown in the following student table structure. 
	 * Column Name Type  Constraint
	 * Rollno Number (4) Primary Key
	 * StudentName Varchar (20)  Not Null
	 * Standard Varchar (2) Not Null
	 * Date_Of_Birth Date 
	 * Fees Number (9,2)     
	 * 
	 * When a new student joins the school, the student record is inserted in the student table.  The valid student details are as follows:
	 * • Rollno: Valid value is a 4-digit number 
	 * • StudentName: Valid value can contain maximum 20 letters in uppercase
	 * • Standard : Valid values are Roman Letters representing I to X(I, II, III, IV….IX, X)
	 * Write a Java program to insert some records to the table
	 */
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Connection con = new GetConnection().getConnection();
		Statement s = con.createStatement();
		
		DatabaseMetaData dbMetaData = con.getMetaData();
	    ResultSet tables = dbMetaData.getTables(null, null, "ABC_International_School".toUpperCase(), null); 
	    if(!tables.next())
	    {
	    	String table = "Create table ABC_International_School(ROLLNO number(4) PRIMARY KEY, STUDENTNAME varchar2(20) NOT NULL, "
	    			+ "STANDARD varchar2(3), DATE_OF_BIRTH date, FEES number(9, 2))";
	    	s.execute(table);
	    }
		
	    Scanner sc = new Scanner(System.in);
	    int rollNo;
		do 
		{
			System.out.print("Enter rollno: ");
			try
			{
				rollNo = sc.nextInt();
				sc.nextLine();
			}
			catch(Exception e)
			{
				System.out.println("Invalid rollno");
				rollNo = 0;
			}
		} while (rollNo == 0);
		
		String studentName = "";
		boolean isLowerCaseFound;
		do 
		{
			System.out.print("Enter name: ");
			studentName = sc.nextLine();
			isLowerCaseFound = false;
			if(studentName.length() <= 20)
			{
				for (int i = 0; i < studentName.length(); i++) 
				{
					if (Character.isLowerCase(studentName.charAt(i))) 
					{
						isLowerCaseFound = true;
						break;
					}
				}
			}
			
		} while (isLowerCaseFound);
		
		String standard = "";
		String[] standards = {"I", "II", "III", "IV", "V", "Vi", "VII", "VIII", "IX", "X"};
		List<String> list = new ArrayList<>();
		for(String st: standards)
			list.add(st);
		do 
		{
			System.out.print("Enter standard: ");
			standard = sc.nextLine();
		} while (!list.contains(standard));

		System.out.print("Enter Date of birth(yyyy-mm-dd) : ");
		String dob = sc.nextLine();
		
		Double fees = 0.0;
		do 
		{
			System.out.print("Enter fees: ");
			if (sc.hasNextDouble())
				fees = sc.nextDouble();
		} while (fees == 0.0);
		
		sc.close();
		
		String insert = "Insert into ABC_International_School values(?, ?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(insert);
		ps.setInt(1, rollNo);
		ps.setString(2, studentName);
		ps.setString(3, standard);
		ps.setDate(4, java.sql.Date.valueOf(dob));
		ps.setDouble(5, fees);
		
		try
		{
			ps.execute();
			System.out.println("Successfully inserted");
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println("Not inserted");
		}
	}
}
