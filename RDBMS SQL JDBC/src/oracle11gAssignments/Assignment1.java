package oracle11gAssignments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Assignment1 
{
	/*
	 * Using SQL Developer: Create a database connection using the following information:
	 * Connection Name: myconnection
	 * Username: hr
	 * Password: hr
	 * Hostname: localhost
	 * Port: 1521
	 * SID: ORCL
	 * Ensure that you select the Save Password check box.
	 * Testing and Connecting Using the Oracle SQL Developer Database Connection
	 * If the status is Success, connect to the database using this new connection.
	 */
	public static void main(String[] args) 
	{
		Connection myconnection = null;
		try 
		{
			// Register oracle driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String hostName = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String username = "system";
			String password = "0001";
			// Creating connection
			myconnection = DriverManager.getConnection(hostName, username, password);
			if(!myconnection.isClosed())
				System.out.println("Connection is Done");
			else
				System.out.println("Connection is not working");
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally 
		{
			System.out.println("Finally myconnection is closed.");
			try 
			{
				myconnection.close();
			} 
			catch (SQLException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
