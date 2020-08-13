package groupFunctionAssignments;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Assignment5
{
	/*
	 * Create a report to display the manager number and the salary of the lowest-paid employee 
	 * for that manager. Exclude anyone whose manager is not known. Exclude any groups where the 
	 * minimum salary is $6,000 or less. Sort the output in descending order of salary.
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
		
		
		String select_query = "Select MANAGER_ID, MIN(SALARY) As \"Minimum Salary\" from employee where MANAGER_ID<>0 Group by MANAGER_ID having MIN(SALARY)>6000 Order by MIN(SALARY)";
		
	   
	    ResultSet rs = s.executeQuery(select_query);
		
	    System.out.format("%-20s%-20s", "MANAGER_ID", "Minimum Salary");
	    System.out.println();
		
//		System.out.println("\nData of employee table:-");
		while(rs.next())
		{
			System.out.format("%-20s%-20s", rs.getInt(1), rs.getFloat(2));
			System.out.println();
		}
		
	    con.close();
	}
}
