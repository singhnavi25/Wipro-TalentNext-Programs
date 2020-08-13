package executingQueryAndResultsAssignments;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dmlAssignments.GetConnection;

public class Assigment2 
{
	/*
	 * Modify the above program to display all the rows where sal 
	 * is greater than 1000 and less than 2000. Display the columns 
	 * ename, job, sal and comm.
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		/*
		 * Create table employee(EMPLOYEE_ID number(5), FIRST_NAME varchar2(15), LAST_NAME varchar2(15), 
		 * EMAIL varchar2(30), PHONE_NUMBER number(15), HIRE_DATE date, JOB_ID varchar2(10), SALARY number(10, 2), 
		 * COMMISSION_PCT number(5, 2), MANAGER_ID number(5), DEPARTMENT_ID number(3))
		 */
		
		Connection con = new GetConnection().getConnection();
		
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery("Select FIRST_NAME || ' ' || LAST_NAME as ename, JOB_ID as job, "
				+ "SALARY as sal, COMMISSION_PCT as comm from EMPLOYEE where SALARY>1000 and SALARY<62000 order by ename");
		
		System.out.format("%-15s%-15s%-15s%-15s\n", "ename", "job", "sal", "comm");
		while(rs.next())
			System.out.format("%-15s%-15s%-15s%-15s\n",rs.getString("ename"), rs.getString("job"), rs.getFloat("sal"), rs.getDouble("comm"));
		
		if(rs!=null)
			rs.close();
		if(stmt!=null)
			stmt.close();
		if(con!=null)
			con.close();
	}
}
