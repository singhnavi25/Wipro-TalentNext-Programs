package selectStatementAssigments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// we are using table created in Assignment2
public class Assignment4 
{
	/*
	 *  Create a query to display employee id, last name, job id and hiredate from employee
	 *  table with more describing column names. 
	 *  Name the column headings 
	 *  Emp # , Employee , Job , and Hire Date , respectively.
	 */
	public static void main(String[] args) throws SQLException, ClassNotFoundException 
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String hostName = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String username = "system";
		String password = "0001";
		// Creating connection
		Connection con = DriverManager.getConnection(hostName, username, password);
		Statement s = con.createStatement();
	    
	    // Structure of department table
	    System.out.println("\nStructure of employee table:-");
	    String select_query = "Select EMPLOYEE_ID AS Emp, LAST_NAME AS Employee, JOB_ID AS Job, HIRE_DATE AS \"Hire Date\" from employee";
	    System.out.format("%-20s%-20s%-20s%-20s", "Emp", "Employee", "Job", "Hire Date");
	    System.out.println();
	    ResultSet rs = s.executeQuery(select_query);
		
//		System.out.println("\nData of employee table:-");
		while(rs.next())
		{
			System.out.format("%-20s%-20s%-20s%-20s", rs.getInt(1)+"", rs.getString(2), rs.getString(3), rs.getDate(4)+"");
			System.out.println();
		}
		
	    con.close();
	}
}
