package restrictingAndSortingDataAssignments;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Assignment9 
{
	/*
	 * Create a report to display the last name, salary, and commission of all employees who earn commissions. 
	 * Sort data in descending order of salary and commissions. Use the column’s numeric position in the ORDER BY clause.
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		// Create table employee(EMPLOYEE_ID number(5), FIRST_NAME varchar2(15), LAST_NAME varchar2(15),
		// EMAIL varchar2(30), PHONE_NUMBER number(15), HIRE_DATE date, JOB_ID varchar2(10), SALARY number(10, 2), 
		// COMMISSION_PCT number(5, 2), MANAGER_ID number(5), DEPARTMENT_ID number(3))
		Connection con = new GetConnection().getConnection();
		Statement s = con.createStatement();
		
	    String select_query = "Select LAST_NAME, SALARY, COMMISSION_PCT from employee where COMMISSION_PCT >0 ORDER BY 2 Desc, 3 Desc";
	   
	    ResultSet rs = s.executeQuery(select_query);
		
	    System.out.format("%-20s%-20s%-20s", "LAST_NAME", "SALARY", "COMMISSION_PCT");
	    System.out.println();
		
//		System.out.println("\nData of employee table:-");
		while(rs.next())
		{
			System.out.format("%-20s%-20s%-20s",rs.getString(1), rs.getInt(2), rs.getDouble(3));
			System.out.println();
		}
		
	    con.close();
	}
}
