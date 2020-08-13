package dmlAssignments;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import groupFunctionAssignments.GetConnection;

public class Assignment3 
{
	/*
	 * Insert one record without listing the column names in the insert statement. Check whether data is inserted
	 * Eg:
	 * employee_id    first_name    last_name    department_id     salary
	 * 201            Michael          Hartstein      20            13000
	 */
	
	/*
	 * Insert one record with listing the column names avoiding salary column in the insert statement where salary 
	 * value remain undetermined. Check whether data is inserted 
	 * employee_id first_name last_name department_id salary
	 * 201           Michael  Hartstein   20           13000
	 * 202            Pat       Fay       20           (null)
	 * 203            Susan     Mavris    40           (null)
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
		
		String insert_query = "Insert into employee values(207, 'Manjot', 'Singh', 'MHARTSTE', 5151005555, TO_DATE('2004-04-26', 'yyyy/mm/dd'), 'MK_MAN', 63000.0, 0.0, 100, 20)";
	   
	    ResultSet rs = s.executeQuery(insert_query);
		
	    if(rs.next())
	    	System.out.println("Row is inserted successfully");
	    else
	    	System.out.println("Not inserted");
		
	    con.close();
	}
}
