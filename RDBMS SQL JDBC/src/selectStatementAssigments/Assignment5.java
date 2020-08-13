package selectStatementAssigments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Assignment5 
{
	/*
	 * Create a report of all employees and their job IDs. Display the last name concatenated with 
	 * the job ID (separated by a comma and space) and name the column as "Employee and Title"
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
	
	    String select_query = "Select LAST_NAME || ', ' || JOB_ID AS \"Employee and Title\"  from employee";
	   
	    ResultSet rs = s.executeQuery(select_query);
		
		System.out.println("Employee and Title\n");
		while(rs.next())
			System.out.println(rs.getString(1));
		
	    con.close();
	}
}
