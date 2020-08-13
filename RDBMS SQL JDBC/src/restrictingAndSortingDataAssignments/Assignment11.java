package restrictingAndSortingDataAssignments;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Assignment11 
{
	/*
	 * Create a query that prompts the user for a manager ID and generates the employee ID, last name, 
	 * salary and department for that manager’s employees and prompts a column name by which result should be sorted.
	 * Eg:
	 * manager_id :103
	 * sorted_by : last_name
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		// Create table employee(EMPLOYEE_ID number(5), FIRST_NAME varchar2(15), LAST_NAME varchar2(15),
		// EMAIL varchar2(30), PHONE_NUMBER number(15), HIRE_DATE date, JOB_ID varchar2(10), SALARY number(10, 2), 
		// COMMISSION_PCT number(5, 2), MANAGER_ID number(5), DEPARTMENT_ID number(3))
		Connection con = new GetConnection().getConnection();
		Statement s = con.createStatement();
		
//	    String select_query = "Select LAST_NAME, SALARY from employee where SALARY>&Salary_value"; // works in sql database
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value for Manager_id: ");
		int Manager_id = sc.nextInt();
		
		System.out.print("Enter value for order_column: ");
		String order_column = sc.next();
//		String select_query = "Select EMPLOYEE_ID, LAST_NAME, SALARY, DEPARTMENT_ID from employee where MANAGER_ID=&Manager_id ORDER BY &order_column";
		String select_query = "Select EMPLOYEE_ID, LAST_NAME, SALARY, DEPARTMENT_ID from employee where MANAGER_ID="+Manager_id+" ORDER BY " + order_column.toUpperCase();
		sc.close();
	   
	    ResultSet rs = s.executeQuery(select_query);
		
	    System.out.format("%-20s%-20s%-20s%-20s", "EMPLOYEE_ID", "LAST_NAME", "SALARY", "DEPARTMENT_ID");
	    System.out.println();
		
//		System.out.println("\nData of employee table:-");
		while(rs.next())
		{
			System.out.format("%-20s%-20s%-20s%-20s", rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4));
			System.out.println();
		}
		
	    con.close();
	}
}
