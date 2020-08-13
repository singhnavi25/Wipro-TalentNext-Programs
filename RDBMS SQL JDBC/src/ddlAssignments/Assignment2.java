package ddlAssignments;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dmlAssignments.GetConnection;

public class Assignment2 
{
	/*
	 * Populate the DEPT table with data from the Departments table.
	 * Include only columns that you need.
	 * Insert dept id 10 and Name Accounts
	 * Insert dept id as null and Name as IT
	 * Correct by giving 10 and IT
	 * Insert A1 as Id and Accounts
	 * Correct by giving 30 and Accounts
	 */
	public static void insert(int id, String name) throws ClassNotFoundException, SQLException
	{
		Connection con = new GetConnection().getConnection();
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("Select * from DEPT where DEPT_ID="+id);
		if(rs.next())
			System.out.println("Already Exist");
		else
		{
			if(s.execute("Insert into DEPT values("+id+", \'"+name+"\'"))
				System.out.println("Inserted successfully");
			else
				System.out.println("Not inserted");
		}
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		
		insert(10, "Accounts");
		// can not insert null as primary key
//		checkInsert(s.execute("Insert into DEPT values((null), 'IT')"));
		// primary key value can not be repeated
		insert(10, "IT");
		// DEPT_ID is of number type so we can not insert A1 as id
//		checkInsert(s.execute("Insert into DEPT values(A1, 'Accounts')"));
		insert(30, "Accounts");
		
		Connection con = new GetConnection().getConnection();
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("Select * from DEPT");
		System.out.format("%-20s%-20s", "DEPT_ID", "DEPT_NAME");
		System.out.println();
		
		while(rs.next())
		{
			System.out.format("%-20s%-20s", rs.getInt(1), rs.getString(2));
			System.out.println();
		}
	}
}
