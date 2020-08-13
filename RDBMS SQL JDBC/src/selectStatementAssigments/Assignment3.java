package selectStatementAssigments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
// we are using table created in Assignment2
public class Assignment3
{
	/*
	 * Create a query to display all unique job IDs from the EMPLOYEES table.
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
	
	    String select_query = "Select distinct JOB_ID from employee";
	   
	    ResultSet rs = s.executeQuery(select_query);
		
		System.out.println("All unique JOB_ID from employee table:-");
		while(rs.next())
			System.out.println(rs.getString(1));
		
	    con.close();
	}
}
