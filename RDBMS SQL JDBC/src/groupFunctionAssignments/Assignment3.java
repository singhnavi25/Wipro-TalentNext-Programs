package groupFunctionAssignments;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Assignment3 
{
	/*
	 * Determine the number of managers without listing them. Label the column Number of Managers
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
		
		
		String select_query = "Select COUNT(DISTINCT MANAGER_ID) \"Number of Managers\" from employee";
		
	   
	    ResultSet rs = s.executeQuery(select_query);
		
	    System.out.format("%-20s", "Number of Managers");
	    System.out.println();
		
//		System.out.println("\nData of employee table:-");
		while(rs.next())
		{
			System.out.format("%-20s", rs.getInt(1));
			System.out.println();
		}
		
	    con.close();
	}
}
