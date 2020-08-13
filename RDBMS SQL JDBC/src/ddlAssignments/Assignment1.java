package ddlAssignments;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import restrictingAndSortingDataAssignments.GetConnection;

public class Assignment1 
{
	/*
	 * Create the DEPT table based on the following table instance chart. Save the 
	 * statement in a script called lab_10_01.sql, and then execute the statement in the 
	 * script to create the table. Confirm that the table is created.
	 * Specification Values:
	 * Column named Dept_ID Numeric 7 size and world be primary key.
	 * Column named Dept_Name of varchar2 size 20.
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Connection con = new GetConnection().getConnection();
		Statement s = con.createStatement();
		boolean created = false;
		String lab_10_01 = "Create table DEPT(Dept_ID number(7) PRIMARY KEY, Dept_Name varchar2(20))";
		
		DatabaseMetaData dbMetaData = con.getMetaData();  
	    ResultSet tables = dbMetaData.getTables(null, null, "DEPT", null);   
	    if(tables.next())
	    	created  = true;
	    else
	    	created = s.execute(lab_10_01);
	    
		if(created)
		{
			System.out.println("Table is created successfully");
			System.out.format("%-20s%-20s%-20s%-20s", "COLUMN_NAME", "DATA_TYPE", "COLUMN_SIZE", "IS_NULLABLE");
			System.out.println();
			
			tables = dbMetaData.getColumns(null,null, "DEPT", null);
			while(tables.next())
			{
			    String columnName = tables.getString("COLUMN_NAME");
			    String datatype = tables.getString("TYPE_NAME");
			    String columnsize = tables.getString("COLUMN_SIZE");
			    String isNullable = tables.getString("IS_NULLABLE");
			    
			    System.out.format("%-20s%-20s%-20s%-20s", columnName, datatype, columnsize, isNullable);
				System.out.println();
			}
		}
		else
			System.out.println("Table is not created");
	}
}
