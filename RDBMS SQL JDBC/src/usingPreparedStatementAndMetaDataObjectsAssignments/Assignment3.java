package usingPreparedStatementAndMetaDataObjectsAssignments;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Assignment3 
{
	/*
	 * Deleting a Student’s record
	 * When a student leaves the school, the record related to that student needs to 
	 * be deleted from the Student table. The student’s roll no, whose record has to 
	 * be deleted, should be passed as a command line argument.
	 * Upon deletion, the Student details must be stored in another table named StudentLog
	 * which will maintain the details such as Rollno, StudentName, Standard and Leaving_date.
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Connection con = new GetConnection().getConnection();
		Statement s = con.createStatement();
		
		con.setAutoCommit(false);
		
		DatabaseMetaData dbMetaData = con.getMetaData();
	    ResultSet tables = dbMetaData.getTables(null, null, "ABC_International_School_Log".toUpperCase(), null); 
	    if(!tables.next())
	    {
	    	String table = "Create table ABC_International_School_Log(ROLLNO number(4) PRIMARY KEY, STUDENTNAME varchar2(20) NOT NULL, "
	    			+ "STANDARD varchar2(3), DATE_OF_BIRTH date, FEES number(9, 2), LEAVING_DATE date)";
	    	s.execute(table);
	    }
	    
	    int rollNo = Integer.parseInt(args[0]);
	    
	    PreparedStatement ps = con.prepareStatement("Select * from ABC_International_School where ROLLNO = ?");
	    ps.setInt(1, rollNo);
	    
	    ResultSet rs = ps.executeQuery();
	    
	    ps = con.prepareStatement("Delete from ABC_International_School where ROLLNO = ?");
	    ps.setInt(1, rollNo);
	    
	    try
	    {
	    	ps.execute();
	    	System.out.println("Row deleted");
	    }
	    catch (Exception e) 
	    {
			// TODO: handle exception
	    	System.out.println("Deletion error");
	    	ps = con.prepareStatement("Rollback");
	    	ps.execute();
		}
	    
	    ps = con.prepareStatement("Insert into ABC_International_School_Log values(?, ?, ?, ?, ?, ?)");
	    rs.next();
	    ps.setInt(1, rs.getInt(1));
	    ps.setString(2, rs.getString(2));
	    ps.setString(3, rs.getString(3));
	    ps.setDate(4, rs.getDate(4));
	    ps.setDouble(5, rs.getDouble(5));
	    java.sql.Date date = getCurrentDatetime();
	    ps.setDate(6, date);
	    
	    try
	    {
	    	ps.execute();
	    	System.out.println("Inserted into Log table");
	    }
	    catch (Exception e) 
	    {
			// TODO: handle exception
	    	System.out.println("Insertion is not done");
	    	ps = con.prepareStatement("Rollback");
	    	ps.execute();
		}
	    
	    ps = con.prepareStatement("Commit");
	    ps.execute();
	    
	    con.setAutoCommit(true);
	}
	public static java.sql.Date getCurrentDatetime() 
	{
	    java.util.Date today = new java.util.Date();
	    return new java.sql.Date(today.getTime());
	}
}
