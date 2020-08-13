package dmlAssignments;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Assignment7
{
	/*
	 * Delete employees whose name either first or last name has char seq of ‘man’
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		/*
		 * Create table employee(EMPLOYEE_ID number(5), FIRST_NAME varchar2(15), LAST_NAME varchar2(15), 
		 * EMAIL varchar2(30), PHONE_NUMBER number(15), HIRE_DATE date, JOB_ID varchar2(10), SALARY number(10, 2), 
		 * COMMISSION_PCT number(5, 2), MANAGER_ID number(5), DEPARTMENT_ID number(3))
		 */
		
		Connection con = new GetConnection().getConnection();
		Statement s = con.createStatement();
		System.out.println("Before Update");
	    ResultSet rs = s.executeQuery("select * from employee where FIRST_NAME like '%man%' or LAST_NAME like '%man%'");
		System.out.format("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s", "EMPLOYEE_ID", "FIRST_NAME", "LAST_NAME", "EMAIL", 
				"PHONE_NUMBER", "HIRE_DATE", "JOB_ID", "SALARY", "COMMISSION_PCT", "MANAGER_ID", "DEPARTMENT_ID");
	    System.out.println();
		while(rs.next())
		{
			System.out.format("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s",rs.getInt(1), rs.getString(2), rs.getString(3), 
					rs.getString(4), rs.getLong(5), rs.getDate(6), rs.getString(7), rs.getDouble(8), rs.getDouble(9), rs.getInt(10),
					rs.getInt(11));
			System.out.println();
		}
		
		System.out.println("\nAfter Update");
		
		String updateQuery = "Delete employee where FIRST_NAME like '%man%' or LAST_NAME like '%man%'"; // Fay
		s.execute(updateQuery);
		rs = s.executeQuery("select * from employee where EMPLOYEE_ID=202");  
		System.out.format("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s", "EMPLOYEE_ID", "FIRST_NAME", "LAST_NAME", "EMAIL", 
				"PHONE_NUMBER", "HIRE_DATE", "JOB_ID", "SALARY", "COMMISSION_PCT", "MANAGER_ID", "DEPARTMENT_ID");
	    System.out.println();
		while(rs.next())
		{
			System.out.format("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s",rs.getInt(1), rs.getString(2), rs.getString(3), 
					rs.getString(4), rs.getLong(5), rs.getDate(6), rs.getString(7), rs.getDouble(8), rs.getDouble(9), rs.getInt(10),
					rs.getInt(11));
			System.out.println();
		}
	}
}
