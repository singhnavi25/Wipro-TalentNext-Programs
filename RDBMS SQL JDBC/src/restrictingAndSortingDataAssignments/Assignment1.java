package restrictingAndSortingDataAssignments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
// We are using Assignment2 table from selectStatementAssigments package
public class Assignment1 
{
	/*
	 * Create a report that displays the last name and salary of 
	 * employees who earn more than $12,000.
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
	
	    String select_query = "Select LAST_NAME, SALARY  from employee where SALARY > 12000";
	   
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
