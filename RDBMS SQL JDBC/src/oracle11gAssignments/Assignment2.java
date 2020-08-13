package oracle11gAssignments;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Assignment2 
{
	/*
	 * Expand MyConnection -- > Explore
	 * All the available table
	 * structure of Employee table - its columns
	 * view the data tab of the Employee tables
	 */
	public static void main(String[] args) throws SQLException 
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
			
			Statement s = myconnection.createStatement();
//			ResultSet rs = s.executeQuery("Select owner, table_name from all_tables where owner='NAVI'");
//			ResultSet rs = s.executeQuery("Select owner, table_name from all_tables");
//			while(rs.next())
//				System.out.println(rs.getString(1) + "  " + rs.getString(2));
			
//			DatabaseMetaData dbMetaData = myconnection.getMetaData();
//			   
//		    ResultSet rs = dbMetaData.getTables(null, null, null, null);       
//		    
//		    while (rs.next())
//		    	System.out.println("Table name - "+ rs.getString(3));
			
			 ResultSet rs = s.executeQuery("select * from employee");
			 ResultSetMetaData rsmd = rs.getMetaData();
			 for(int i=1; i<=rsmd.getColumnCount(); i++)
				 System.out.println(rsmd.getColumnName(i) + " " + rsmd.getColumnTypeName(i));
			
//			ResultSet rs1 = s.executeQuery("Select * from Employee");
//			while(rs1.next())
//				System.out.println(rs1.getString(1) + "  " + rs1.getString(2) + " " + rs1.getInt(3));
		} 
		catch (ClassNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally 
		{
			System.out.println("Finally myconnection is closed.");
			if(myconnection!=null)
				myconnection.close();
		}
	}
}
