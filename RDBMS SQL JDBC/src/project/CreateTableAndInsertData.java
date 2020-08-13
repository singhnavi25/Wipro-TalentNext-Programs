package project;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * Create the following table using SQL Command Line:
Column Name Field Type 
UserID Varchar(200) 
Password Varchar(200) 
Name Varchar(200) 
IncorrectAttempts Number(2) 
LockStatus Number(2) 
UserType Varchar(200)
 */

/*
 * Insert the following record(s) to the table – (use SQL Command Line)
1 (AB1001, AB1001, Hari, 0, 0, Admin) 
2 (TA1002, TA1002, Prasath, 0, 0, Employee) 
3 (RS1003, RS1003, Ganesh, 0, 0, Employee)
 */
public class CreateTableAndInsertData 
{
	public CreateTableAndInsertData() throws ClassNotFoundException, SQLException
	{
		String create = "Create table Users(UserID varchar(200), Password varchar(200), "
				+ "Name varchar(200), IncorrectAttempts number(2), LockStatus number(2), "
				+ "UserType varchar(200))";
		Connection con = new GetConnection().getConnection();
		DatabaseMetaData dbMetaData = con.getMetaData();
		ResultSet tables = dbMetaData.getTables(null, null, "USERS", null);
		if(tables.next())
			System.out.println("Table is already there");
		else
		{
			Statement s = con.createStatement();
			s.execute(create);
			System.out.println("Table is created successfully");
			s.executeUpdate("Insert into Users values('AB1001', 'AB1001', 'Hari', 0, 0, 'Admin')");
			s.executeUpdate("Insert into Users values('TA1002', 'TA1002', 'Prasath', 0, 0, 'Employee')");
			s.executeUpdate("Insert into Users values('RS1003', 'RS1003', 'Ganesh', 0, 0, 'Employee')");
			System.out.println("Data is inserted successfully");
		}
		
	}
}
