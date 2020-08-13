package restrictingAndSortingDataAssignments;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Assignment6
{
	/*
	 * List employees who earn between $5,000 and $12,000, and are in department 20 or 50. Label the columns as
	 * Employee and Monthly Salary, respectively
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		// Create table employee(EMPLOYEE_ID number(5), FIRST_NAME varchar2(15), LAST_NAME varchar2(15),
		// EMAIL varchar2(30), PHONE_NUMBER number(15), HIRE_DATE date, JOB_ID varchar2(10), SALARY number(10, 2), 
		// COMMISSION_PCT number(5, 2), MANAGER_ID number(5), DEPARTMENT_ID number(3))
		Connection con = new GetConnection().getConnection();
		Statement s = con.createStatement();
		
	    String select_query = "Select LAST_NAME AS Employee, SALARY AS \"Monthly Salary\" from employee where DEPARTMENT_ID in (20, 50) and (SALARY BETWEEN 5000 and 12000)";
	   
	    ResultSet rs = s.executeQuery(select_query);
		
	    System.out.format("%-20s%-20s", "Employee", "Monthly Salary");
	    System.out.println();
		
//		System.out.println("\nData of employee table:-");
		while(rs.next())
		{
			System.out.format("%-20s%-20s",rs.getString(1), rs.getInt(2));
			System.out.println();
		}
		
	    con.close();
	}
}
