package usingPreparedStatementAndMetaDataObjectsAssignments;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Assignment5 
{
	/*
	 * Display Student details
	 * Write the code to display details of all the students, if no roll no. is passed, while executing the main program.
	 * If while executing the main program, the roll no. is passed, then it should display the record of that particular student.
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Connection con = new GetConnection().getConnection();
		int rollNo;
		try
		{
			rollNo = Integer.parseInt(args[0]);
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			rollNo = 0;
		}
		
		PreparedStatement ps = null;
		if(rollNo == 0)
			ps = con.prepareStatement("Select * from ABC_International_School");
		else
		{
			ps = con.prepareStatement("Select * from ABC_International_School where ROLLNO = ?");
			ps.setInt(1, rollNo);
		}
		ResultSet rs = ps.executeQuery();
		System.out.format("%-20s%-20s%-20s%-20s%-20s\n", "ROLL NO", "STUDENT NAME", "STANDARD", "DATE OF BIRTH", "FEES");
		while(rs.next())
		{
			System.out.format("%-20s%-20s%-20s%-20s%-20s\n", rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getDouble(5));
		}
	}
}
