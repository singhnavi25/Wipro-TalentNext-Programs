package restrictingAndSortingDataAssignments;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Assignment10 
{
	/*
	 * Create a report that displays the last name and salary of employees who earn more than an amount that 
	 * the user specifies after a prompt. If you enter 12000, it should display all employees earning more than 12000.
	 * Eg: Salary_value: 12000
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
		System.out.print("Enter value for Salary_value: ");
		String select_query = "Select LAST_NAME, SALARY from employee where SALARY>"+sc.nextInt();
		sc.close();
	   
	    ResultSet rs = s.executeQuery(select_query);
		
	    System.out.format("%-20s%-20s", "LAST_NAME", "SALARY");
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
