package groupFunctionAssignments;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Assignment1 
{
	/*
	 * Find the highest, lowest, sum, and average salary of all employees.  
	 * Label the columns as Maximum, Minimum, Sum, and Average, respectively.  Run the query.
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
		
		
		String select_query = "Select MAX(SALARY) AS \"Maximum Salary\", MIN(SALARY) AS \"Minimum Salary\", SUM(SALARY) AS \"Sum of Salary\", "
				+ "AVG(SALARY) AS \"Average Salary\" from employee";
		
	   
	    ResultSet rs = s.executeQuery(select_query);
		
	    System.out.format("%-20s%-20s%-20s%-20s", "Maximum Salary", "Minimum Salary", "Sum of Salary", "Average Salary");
	    System.out.println();
		
//		System.out.println("\nData of employee table:-");
		while(rs.next())
		{
			System.out.format("%-20s%-20s%-20s%-20s", rs.getFloat(1), rs.getFloat(2), rs.getFloat(3), rs.getFloat(4));
			System.out.println();
		}
		
	    con.close();
	}
}
