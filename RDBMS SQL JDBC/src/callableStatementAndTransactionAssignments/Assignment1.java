package callableStatementAndTransactionAssignments;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

import usingPreparedStatementAndMetaDataObjectsAssignments.GetConnection;

public class Assignment1 
{
	/*
	 * Create a stored procedure that calculates net salary of all the employees whose
	 * records are stored in table "emp".
	 * The criteria for calculating net salary is as follows:
	 * Gross salary = sal + comm.
	 * Net Salary = gross salary - IT
	 * If the employee's commission is null then IT is calculated as
	 * IT = 10% of gross salary
	 * else if the employees commission is less than 500, then IT is calculated as
	 * IT = 15% of gross salary
	 * else
	 * IT = 20% of gross salary.
	 * Develop a jdbc program that invokes this stored procedure by passing the empno and
	 * in return gets the net salary of each employee. Display on screen the empno, ename
	 * and net salary of all the employees.
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		/*Create table employee(EMPLOYEE_ID number(5), FIRST_NAME varchar2(15), 
		 * LAST_NAME varchar2(15) Not Null, EMAIL varchar2(30), PHONE_NUMBER number(15), 
		 * HIRE_DATE date, JOB_ID varchar2(10), SALARY number(10, 2), COMMISSION_PCT number(5, 2), 
		 * MANAGER_ID number(5), DEPARTMENT_ID number(3))
		 */
		Connection con = new GetConnection().getConnection();
		Statement s = con.createStatement();
//		String procedure = "Create or Replace PROCEDURE findSalary(EMP IN number, empno OUT number, ename OUT varchar, salary OUT number, commission OUT number) IS "
//				+ "BEGIN Select EMPLOYEE_ID into empno, FIRST_NAME || ' ' || LAST_NAME into ename, SALARY into salary, COMMISSION_PCT into commission from EMPLOYEE where "
//				+ "EMPLOYEE_ID = EMP; END;" ;
		
		String procedure = "Create or Replace PROCEDURE findSalary(salary IN number, commission IN number, netSalary OUT number) IS "
				+ "BEGIN IF commission = 0 THEN netSalary := salary * 0.90; ELSIF commission < 500 THEN netSalary := (salary + commission) * 0.85;"
				+ "ELSE netSalary := (salary + commission) * 0.80; END IF; END;" ;
		try 
		{
			s.executeUpdate(procedure);
			System.out.println("Procedure created successfully.");
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println("Error in creating procedure");
		}
		
		
		// 100, 103 ids are above 500
		//
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter employee id :");
		int employeeID = sc.nextInt();
		sc.close();
		
		PreparedStatement pstmt = con.prepareStatement("Select EMPLOYEE_ID, FIRST_NAME || ' ' || LAST_NAME, SALARY, COMMISSION_PCT from EMPLOYEE where EMPLOYEE_ID = ?");
		pstmt.setInt(1, employeeID);
		
		ResultSet rs = pstmt.executeQuery();
		if(rs.next())
		{
			int empno = rs.getInt(1);
			String ename = rs.getString(2);
			double salary = rs.getDouble(3);
			double commission = rs.getDouble(4);
			
			CallableStatement cstmt = con.prepareCall("Call findSalary(?, ?, ?)");
			cstmt.setDouble(1, salary);
			cstmt.setDouble(2, commission);;
			cstmt.registerOutParameter(3, Types.DOUBLE);
			
			cstmt.execute();
			
			System.out.format("%-20s%-20s%-20s\n", "empno", "ename", "net salary");
			double netSalary = cstmt.getDouble(3);
			
			System.out.format("%-20s%-20s%-20s\n", empno, ename, netSalary);
		}
		
		else
			System.out.println("Not employee exist with id " + employeeID);
	}
}
