package usingPreparedStatementAndMetaDataObjectsAssignments;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Assignment4 
{
	/*
	 * Modification of Student record When there is a change in the fee to be paid by a student, 
	 * the respective row should be appropriately updated. Pass the rollno from the command prompt 
	 * along with the new fee amount and this amount should be reflected in the table for that particular student.
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Connection con = new GetConnection().getConnection();
		
		int rollNo = Integer.parseInt(args[0]);
		int fees = Integer.parseInt(args[1]);
		
		PreparedStatement ps = con.prepareStatement("Update ABC_International_School Set FEES = ? where ROLLNO = ?");
		ps.setDouble(1, fees);
		ps.setInt(2, rollNo);
		
		if(ps.executeUpdate() == 1)
			System.out.println("Updated Successfully");
		else
			System.out.println("Updation error");
	}
}
