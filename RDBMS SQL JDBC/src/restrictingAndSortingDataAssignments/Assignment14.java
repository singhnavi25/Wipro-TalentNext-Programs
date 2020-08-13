package restrictingAndSortingDataAssignments;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Assignment14 
{
	/*
	 *  Display the last name, job, and salary for all employees whose jobs are either those 
	 *  of a sales representative or of a stock clerk, and whose salaries are not equal to $2,500, $3,500, or $7,000.
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		// Create table employee(EMPLOYEE_ID number(5), FIRST_NAME varchar2(15), LAST_NAME varchar2(15),
		// EMAIL varchar2(30), PHONE_NUMBER number(15), HIRE_DATE date, JOB_ID varchar2(10), SALARY number(10, 2), 
		// COMMISSION_PCT number(5, 2), MANAGER_ID number(5), DEPARTMENT_ID number(3))
		Connection con = new GetConnection().getConnection();
		Statement s = con.createStatement();
		
//		String select_query = "Select EMPLOYEE_ID, LAST_NAME, SALARY, DEPARTMENT_ID from employee where MANAGER_ID=&Manager_id ORDER BY &order_column";
		String select_query = "Select LAST_NAME, JOB_ID, SALARY from employee where JOB_ID in ('SA_REP', 'ST_CLERK') AND SALARY not in (2500, 3500, 7000)";
		
	    ResultSet rs = s.executeQuery(select_query);
		
	    System.out.format("%-20s%-20s%-20s", "LAST_NAME", "JOB_ID", "SALARY");
	    System.out.println();
		
//		System.out.println("\nData of employee table:-");
		while(rs.next())
		{
			System.out.format("%-20s%-20s%-20s", rs.getString(1), rs.getString(2), rs.getInt(3));
			System.out.println();
		}
		
	    con.close();
	}
}
