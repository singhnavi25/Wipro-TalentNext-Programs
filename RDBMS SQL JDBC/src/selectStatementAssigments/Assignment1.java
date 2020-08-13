package selectStatementAssigments;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;


public class Assignment1 
{
	/*
	 *  Determine the structure of the DEPARTMENTS table and its contents.
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
		
		DatabaseMetaData dbMetaData = con.getMetaData();
		   
	    ResultSet tables = dbMetaData.getTables(null, null, "department".toUpperCase(), null);   
	    if(tables.next())
	    {
	    	System.out.println("Table is already exist");
	    }
	    else
	    {
	    	System.out.println("Table is not exist");
			String create_table = "Create table department(departmentid  varchar2(7), departmentname varchar2(30), employeecount number(5))";
			s.executeUpdate(create_table);
			// Inserting data into table
		    s.executeUpdate("insert into department values('ITs1001', 'IT', 5673)");
			s.executeUpdate("insert into department values('PRs1002', 'Production', 2435)");
			s.executeUpdate("insert into department values('HRs1003', 'Human Resource Mangement', 1453)");
			System.out.println("Table created");
	    }
	    
	    
	    // Structure of department table
	    System.out.println("\nStructure of department table:-");
	    ResultSet rs = s.executeQuery("select * from department");
		ResultSetMetaData rsmd = rs.getMetaData();
		for(int i=1; i<=rsmd.getColumnCount(); i++)
			System.out.println(rsmd.getColumnName(i) + " " + rsmd.getColumnTypeName(i));
		
		
		System.out.println("\nData of department table:-");
		while(rs.next())
			System.out.println(rs.getString(1) + "  " + rs.getString(2) + " " + rs.getInt(3));
		
	    con.close();
	}
}
