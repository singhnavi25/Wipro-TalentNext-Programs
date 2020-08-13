package establishConnectionAssignments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Assignment1 
{
	/*
	 * Write a java program that establishes a connection to oracle database successfully. 
	 * If the connection is successful, it should display a message “Connection Established 
	 * successfully”. In case, it is not able to do so due to any exception, it should display 
	 * the message “Connection could  not be established “. If there is an exception, it should 
	 * also display the description of the exception.
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String hostName = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String username = "system";
		String password = "0001";
		// Creating connection
		Connection con = DriverManager.getConnection(hostName, username, password);
		
		if(con == null)
			System.out.println("Connection could  not be established");
		else
		{
			System.out.println("Connection Established successfully");
			con.close();
		}
	}
}
