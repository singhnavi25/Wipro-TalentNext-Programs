package usingPreparedStatementAndMetaDataObjectsAssignments;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DAOClass 
{
	Connection con = null;
	PreparedStatement pstmt = null;
	public DAOClass() throws ClassNotFoundException, SQLException 
	{
		con = new GetConnection().getConnection();
		DatabaseMetaData dbMetaData = con.getMetaData();
		   
	    ResultSet tables = dbMetaData.getTables(null, null, "STUDENTS", null); 
	    if(!tables.next())
	    {
	    	Statement s = con.createStatement();
	    	String table = "Create table STUDENTS(ROLLNO number(5) PRIMARY KEY, NAME varchar2(30), "
	    			+ "GRADE varchar2(4), DOB date, FEE	number(4))";
	    	s.execute(table);
	    }
	}
	public boolean insert(int rollno, String name, String grade, String dob, int fee) 
	{		
		
		try 
		{
			String insert = "Insert into STUDENTS values(?, ?, ?, ?, ?)";
			pstmt = con.prepareStatement(insert);
			pstmt.setInt(1, rollno);
			pstmt.setString(2, name);
			pstmt.setString(3, grade);
			pstmt.setString(4, dob);
			pstmt.setInt(5, fee);
			pstmt.executeUpdate();
			
			return true;
		} 
		catch (SQLException e) 
		{
			return false;
		}
	}
	
	public boolean delete(int rollno) 
	{
		
		try 
		{
			String delete = "Delete STUDENTS where rollno = ?";
			pstmt = con.prepareStatement(delete);
			pstmt.setInt(1, rollno);
			pstmt.executeUpdate();
			
			return true;
		} 
		catch (SQLException e) 
		{
			return false;
		}
	}
	
	public boolean modify(int rollno, int fee) 
	{
			
		try 
		{
			String update = "Update STUDENTS set fee = ? where rollno = ?";
			pstmt = con.prepareStatement(update);
			pstmt.setInt(1, fee);
			pstmt.setInt(2, rollno);
			pstmt.executeUpdate();
			
			return true;
		} 
		catch (SQLException e) 
		{
			return false;
		}
	}
	
	public boolean display(int rollno) 
	{
		
		try 
		{
			String display = "Select * from STUDENTS where rollno = ?";
			pstmt = con.prepareStatement(display);
			pstmt.setInt(1, rollno);
			ResultSet rs = pstmt.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			
			while (rs.next()) 
			{
				String str = "";
				
				for (int i = 1; i <= rsmd.getColumnCount(); i++) 
				{
					String colName = rsmd.getColumnName(i);
					
					str += rs.getObject(colName);
					if (i != rsmd.getColumnCount()) 
						str += ", ";
				}
				System.out.println(str);
			}
			return true;
		} 
		catch (SQLException e) 
		{
			return false;
		}
	}
	
	public boolean display() 
	{
		
		try 
		{
			String display = "Select * from STUDENTS";
			pstmt = con.prepareStatement(display);
			ResultSet rs = pstmt.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			
			while (rs.next()) 
			{
				String str = "";
				
				for (int i = 1; i <= rsmd.getColumnCount(); i++) 
				{
					String colName = rsmd.getColumnName(i);
					
					str += rs.getObject(colName);
					if (i != rsmd.getColumnCount()) 
						str += ", ";
				}
				System.out.println(str);
			}
			
			return true;
		} 
		catch (SQLException e) 
		{
			return false;
		}
	}
}
