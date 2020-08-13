package establishConnectionAssignments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Assignment2
{
	/*
	 * In the just concluded exercise, where you have established the connection 
	 * successfully, exclude the registration process(by commenting the line 
	 * containing the code Class.forName(“..”)). Observe the result.
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
//		Class.forName("oracle.jdbc.driver.OracleDriver");
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
