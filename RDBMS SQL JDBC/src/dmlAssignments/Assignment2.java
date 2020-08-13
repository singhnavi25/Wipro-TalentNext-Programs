package dmlAssignments;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Assignment2 
{
	/*
	 *  Test the table creation by viewing the structure using describe command
	 *  Name                           Null     Type                         
	 *  ------------------------------ -------- ------------------------------
	 *  EMPLOYEE_ID                             NUMBER(6)                    
	 *  FIRST_NAME                              VARCHAR2(20) 
	 *  LAST_NAME                      NOT NULL VARCHAR2(25)  
	 *  DEPARTMENT_ID                           NUMBER(4) 
	 *  SALARY                                  NUMBER(8,2)
	 *  5 rows selected
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		/*
		 * Create table employee(EMPLOYEE_ID number(5), FIRST_NAME varchar2(15), LAST_NAME varchar2(15), 
		 * EMAIL varchar2(30), PHONE_NUMBER number(15), HIRE_DATE date, JOB_ID varchar2(10), SALARY number(10, 2), 
		 * COMMISSION_PCT number(5, 2), MANAGER_ID number(5), DEPARTMENT_ID number(3))
		 */
		
		Connection con = new GetConnection().getConnection();
		Statement s = con.createStatement();
		System.out.println("\nStructure of employee table:-");
	    ResultSet rs = s.executeQuery("select * from employee");
		ResultSetMetaData rsmd = rs.getMetaData();
		System.out.format("%-20s%-20s%-20s", "Name", "Nullable", "Type");
	    System.out.println();
		for(int i=1; i<=rsmd.getColumnCount(); i++)
		{
			System.out.format("%-20s%-20s%-20s", rsmd.getColumnName(i), rsmd.isNullable(i), rsmd.getColumnTypeName(i));
			System.out.println();
		}
	}
}
