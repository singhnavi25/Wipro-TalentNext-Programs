package executingQueryAndResultsAssignments;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dmlAssignments.GetConnection;

public class Assignment1 
{
	/*
	 *  Write a java program that connects to oracle database, queries the 
	 *  inbuilt table “emp” and displays the first two columns (empno using 
	 *  column index and ename using column name ) of all the rows.
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Connection con = new GetConnection().getConnection();
		
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery("Select ID as empno, FIRST_NAME || ' ' || LAST_NAME as ename from EMP");
		
		while(rs.next())
			System.out.println(rs.getInt("empno") + " " + rs.getString("ename"));
		
		if(rs!=null)
			rs.close();
		if(stmt!=null)
			stmt.close();
		if(con!=null)
			con.close();
	}
}
