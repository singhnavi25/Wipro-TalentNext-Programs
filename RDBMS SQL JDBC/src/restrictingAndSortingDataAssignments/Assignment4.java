package restrictingAndSortingDataAssignments;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Assignment4 
{
	/*
	 * Create a report to display the last name, job ID, and hire date for employees with the 
	 * last names of Matos and Taylor. Order the query in ascending order by the hire date.
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		// Create table employee(EMPLOYEE_ID number(5), FIRST_NAME varchar2(15), LAST_NAME varchar2(15),
		// EMAIL varchar2(30), PHONE_NUMBER number(15), HIRE_DATE date, JOB_ID varchar2(10), SALARY number(10, 2), 
		// COMMISSION_PCT number(5, 2), MANAGER_ID number(5), DEPARTMENT_ID number(3))
		Connection con = new GetConnection().getConnection();
		Statement s = con.createStatement();
		
	    String select_query = "Select LAST_NAME, JOB_ID, HIRE_DATE from employee where LAST_NAME = 'Matos' or LAST_NAME = 'Taylor' ORDER BY HIRE_DATE";
	   
	    ResultSet rs = s.executeQuery(select_query);
		
	    System.out.format("%-20s%-20s%-20s", "LAST_NAME", "JOB_ID", "HIRE_DATE");
	    System.out.println();
		
//		System.out.println("\nData of employee table:-");
		while(rs.next())
		{
			System.out.format("%-20s%-20s%-20s",rs.getString(1), rs.getString(2), rs.getDate(3));
			System.out.println();
		}
		
	    con.close();
	}
}
