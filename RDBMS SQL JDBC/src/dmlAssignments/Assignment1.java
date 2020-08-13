package dmlAssignments;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import groupFunctionAssignments.GetConnection;

public class Assignment1 
{
	/*
	 * Run the below script
	 * Create table MY_EMPLOYEE 
	 * as
	 * Select employee_id,first_name,last_name,department_id,salary from EMPLOYEES where 1=2;
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
		
		String select_query = "Select EMPLOYEE_ID, FIRST_NAME, LAST_NAME, DEPARTMENT_ID, SALARY from employee where 1=2";
		// nothing is printed
	   
	    ResultSet rs = s.executeQuery(select_query);
		
	    System.out.format("%-20s%-20s%-20s%-20s%-20s", "EMPLOYEE_ID", "FIRST_NAME", "LAST_NAME", "DEPARTMENT_ID", "SALARY");
	    System.out.println();
		
//		System.out.println("\nData of employee table:-");
		while(rs.next())
		{
			System.out.format("%-20s%-20s%-20s%-20s%-20s", rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDouble(5));
			System.out.println();
		}
		
	    con.close();
	}
}
