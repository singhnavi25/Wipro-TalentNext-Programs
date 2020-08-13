package ddlAssignments;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import restrictingAndSortingDataAssignments.GetConnection;

public class Assignment3 
{
	/*
	 * Create the EMP table based on the following table instance chart. Save the 
	 * statement in a script called lab_10_03.sql, and then execute the statement in the 
	 * script to create the table. Confirm that the table is created.
	 * Specification- Values
	 * Column Name: ID, LAST_NAME, FIRST_NAME, DEPT_ID
	 * Key type: PK, -, -, FK
	 * Nulls/ Unique: -, Not null, -, -
	 * FK Table: - -, -, -, DEPT
	 * FK Column: -, -, -, ID
	 * Date Type: NUMBER, VARCHAR2, VARCHAR2, NUMBER
	 * Length: 7, 25, 25, 7
	 * 
	 * Insert 101, Sam, Sunder, 10
	 * Insert 101, Ram, Krishna, 20
	 * Insert 102, Gopi, null, 40
	 * Insert 103, null, ram, 20
	 */
	public static void insert(int id, String lName, String fName, int deptId) 
			throws ClassNotFoundException, SQLException
	{
		Connection con = new GetConnection().getConnection();
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("Select * from EMP where ID="+id);
		if(rs.next())
			System.out.println("Already Exist");
		else
		{
			if(s.execute("Insert into EMP values("+id+", \'"+lName+"\', \'"+fName+"\'"+
							", "+deptId + ")"))
				System.out.println("Inserted successfully");
			else
				System.out.println("Not inserted");
		}
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Connection con = new GetConnection().getConnection();
		Statement s = con.createStatement();
		boolean created = false;
		String lab_10_03 = "Create table EMP(ID number(7) PRIMARY KEY, "
				+ "LAST_NAME varchar2(20) NOT NULL, First_Name varchar2(20), "
				+ "DEPT_ID number(7), FOREIGN KEY (DEPT_ID) References DEPT(DEPT_ID))";
		
		DatabaseMetaData dbMetaData = con.getMetaData();  
	    ResultSet tables = dbMetaData.getTables(null, null, "EMP", null);   
	    if(tables.next())
	    	created  = true;
	    else
	    	created = s.execute(lab_10_03);
	    
		if(created)
		{
			System.out.println("Table is created successfully");
			System.out.format("%-20s%-20s%-20s%-20s", "COLUMN_NAME", "DATA_TYPE", "COLUMN_SIZE", "IS_NULLABLE");
			System.out.println();
			
			tables = dbMetaData.getColumns(null,null, "EMP", null);
			while(tables.next())
			{
			    String columnName = tables.getString("COLUMN_NAME");
			    String datatype = tables.getString("TYPE_NAME");
			    String columnsize = tables.getString("COLUMN_SIZE");
			    String isNullable = tables.getString("IS_NULLABLE");
			    
			    System.out.format("%-20s%-20s%-20s%-20s", columnName, datatype, columnsize, isNullable);
				System.out.println();
			}
			
			insert(101, "Sam", "Sunder", 10);
			insert(101, "Ram", "Krishna", 20);
			insert(102, "Gopi", null, 40);
			insert(103, null, "ram", 20);
		}
		else
			System.out.println("Table is not created");
		
	}
}
