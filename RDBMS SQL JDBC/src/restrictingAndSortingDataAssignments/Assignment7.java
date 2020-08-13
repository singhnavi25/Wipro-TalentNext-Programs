package restrictingAndSortingDataAssignments;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Assignment7 
{
	/*
	 *  Create a report that displays the last name and hire date for all employees who were hired in 1994
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		// Create table employee(EMPLOYEE_ID number(5), FIRST_NAME varchar2(15), LAST_NAME varchar2(15),
		// EMAIL varchar2(30), PHONE_NUMBER number(15), HIRE_DATE date, JOB_ID varchar2(10), SALARY number(10, 2), 
		// COMMISSION_PCT number(5, 2), MANAGER_ID number(5), DEPARTMENT_ID number(3))
		Connection con = new GetConnection().getConnection();
		Statement s = con.createStatement();
		
	   // There is no entry of 1994
//		String select_query = "Select LAST_NAME, HIRE_DATE from employee where HIRE_DATE >= TO_DATE('1994-01-01', 'yyyy/mm/dd') and HIRE_DATE < TO_DATE('1995-01-01', 'yyyy/mm/dd')";
		
		String select_query = "Select LAST_NAME, HIRE_DATE from employee where HIRE_DATE >= TO_DATE('2006-01-01', 'yyyy/mm/dd') and HIRE_DATE < TO_DATE('2007-01-01', 'yyyy/mm/dd')";
	    ResultSet rs = s.executeQuery(select_query);
		
	    System.out.format("%-20s%-20s", "LAST_NAME", "HIRE_DATE");
	    System.out.println();
		
//		System.out.println("\nData of employee table:-");
		while(rs.next())
		{
			System.out.format("%-20s%-20s",rs.getString(1), rs.getDate(2)+"");
			System.out.println();
		}
		
	    con.close();
	}
}
