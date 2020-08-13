package project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
	public static String getUserType(String userID) throws ClassNotFoundException, SQLException
	{
		/*
		 * Create a method String getUserType(String userID). This method should do the following operation.
		 * a) Obtain the Connection Object by calling the getConnection() method. 
		 * b) Using the Connection Object, retrieve the userType and return it.
		 * c) Create a main method and call the getUserType method and print the value obtained
		 */
		Connection con = new GetConnection().getConnection();
		PreparedStatement ps = con.prepareStatement("Select UserType from Users where UserID = ?");
		ps.setString(1, userID);
		ResultSet rs = ps.executeQuery();
		if(rs.next())
			return rs.getString(1);
		return null;
	}
	public static String getIncorrectAttempts(String userID) throws ClassNotFoundException, SQLException
	{
		/*
		 * Create a method String getIncorrectAttempts(String userID). This method should do the following operation. 
		 * a) Obtain the Connection Object by calling the getConnection() method. 
		 * b) Using the Connection Object, retrieve the Incorrect Attempts. If the incorrect attempt is 0, 
		 * 		return “No Incorrect Attempt”, else if the incorrect attempt is 1, return “One Time”, else return “Incorrect Attempt Exceeded”. 
		 * c) Create a main method and call the getIncorrectAttempts method and print the value obtained.
		 */
		Connection con = new GetConnection().getConnection();
		PreparedStatement ps = con.prepareStatement("Select IncorrectAttempts from Users where UserID = ?");
		ps.setString(1, userID);
		ResultSet rs = ps.executeQuery();
		if(rs.next())
		{
			if(rs.getInt(1) == 0)
				return "No Incorrect Attempt";
			return "Incorrect Attempt Exceeded";
		}
		return null;
	}
	
	public static String changeUserType(String userID) throws ClassNotFoundException, SQLException
	{
		/*
		 * Create a method String changeUserType(String userID). This method should do the following operation.
		 * a) Obtain the Connection Object by calling the getConnection() method. 
		 * b) Using the Connection Object, update the user type of the given userID to Admin. If more than 
		 * 		one row updated return message as “Update Success”, else return “Update Failed”
		 * c) Create a main method and call the changeUserType method and print the value obtained.
		 */
		Connection con = new GetConnection().getConnection();
		PreparedStatement ps = con.prepareStatement("Update Users set UserType = 'Admin' where UserId = ?");
		ps.setString(1, userID);
		if(ps.executeUpdate() > 0)
			return "Update Success";
		return "Update Failed";
	}
	
	public static int getLockStatus() throws ClassNotFoundException, SQLException
	{
		/*
		 * Create a method int getLockStatus(). This method should do the following operation. 
		 * a) Obtain the Connection Object by calling the getConnection() method. 
		 * b) Using the Connection Object, count the total rows with the lock status 0. 
		 * c) Create a main method and call the getLockStatus method and print the value obtained.
		 */
		Connection con = new GetConnection().getConnection();
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("Select COUNT(LockStatus) from Users where LockStatus=0");
		if(rs.next())
			return rs.getInt(1);
		return 0;
	}
	
	public static String changeName(String id, String name) throws ClassNotFoundException, SQLException
	{
		/*
		 * Create a method String changeName(String id, String name). This method should do the following operation. 
		 * a) Obtain the Connection Object by calling the getConnection() method. 
		 * b) Using the Connection Object, change the name for the given ID. On successful change return “Success”, on-fail return “Failed”. 
		 * c) Create a main method and call the changeName method and print the value obtained. 
		 * d) Go to SQL plus and check the correctness of change.
		 */
		Connection con = new GetConnection().getConnection();
		PreparedStatement ps = con.prepareStatement("Update Users set Name = ? where UserId = ?");
		ps.setString(1, name);
		ps.setString(2, id);
		if(ps.executeUpdate() > 0)
			return "Success";
		return "Failed";
	}
	
	public static String changePassword(String password) throws ClassNotFoundException, SQLException
	{
		/*
		 * Create a method String changePassword(String password). This method should do the following operation. 
		 * a) Obtain the Connection Object by calling the getConnection() method. 
		 * b) Using the Connection Object, change the password to the parameterized password value for all 
		 * 		the records with userType “Admin”. On success, return “Changed”, On Failure return 0. 
		 * c) Create a main method and call the changePassword method
		 * d) Go to SQL plus and check the correctness of change.
		 */
		Connection con = new GetConnection().getConnection();
		PreparedStatement ps = con.prepareStatement("Update Users set Password = ? where UserType = 'Admin'");
		ps.setString(1, password);
		if(ps.executeUpdate() > 0)
			return "Changed";
		return "0";
	}
	
	public static String addUser_1(UserBean bean) throws ClassNotFoundException, SQLException
	{
		/*
		 * a) Create User Bean with following private variables (ID, Password, Name, Incorrect Attempts, Lock 
		 * Status, User Type) and initialize getters and setters. 
		 * b) Obtain the Connection Object by calling the getConnection() method. 
		 * c) Using the Connection Object, insert a new record to the table. (Use the parameter of the 
		 * method to get the values to insert). On successful insert, return “Success”, on-fail return “Fail”
		 * d) Create a main method and set values for the private variables of UserBean, call the addUser_1 
		 * method and print the value obtained. 
		 * e) Go to SQL plus and check the correctness of change.
		 */
		Connection con = new GetConnection().getConnection();
		PreparedStatement ps = con.prepareStatement("Insert into Users values(?, ?, ?, ?, ?, ?)");
		ps.setString(1, bean.getId());
		ps.setString(2, bean.getPassword());
		ps.setString(3, bean.getName());
		ps.setInt(4, bean.getIncorrectAttempts());
		ps.setInt(5, bean.getLockStatus());
		ps.setString(6, bean.getUserType());
		
		if(ps.executeUpdate()>0)
			return "Success";
		return "Fail";
	}
	
	public static String addUser_2(UserBean bean) throws SQLException, ClassNotFoundException
	{
		/*
		 * Create a method String addUser_2(UserBean bean). This method should do the following operation. 
		 * a) Create User Bean with following private variables (ID, Password, Name, Incorrect Attempts, Lock 
		 * Status, User Type) and initialize getters and setters. 
		 * b) Obtain the Connection Object by calling the getConnection() method. 
		 * c) Using the Connection Object, insert a new record to the table if and only if the lockstatus is 0. 
		 * (Use the parameter of the method to get the values to insert). On successful insert, return “Success”, on-fail return “Fail”
		 * d) Create a main method and set values for the private variables of UserBean, call the addUser_2 method and print the value obtained. 
		 * e) Go to SQL plus and check the correctness of change.
		 */
		if(bean.getLockStatus() == 0)
		{
			Connection con = new GetConnection().getConnection();
			PreparedStatement ps = con.prepareStatement("Insert into Users values(?, ?, ?, ?, ?, ?)");
			ps.setString(1, bean.getId());
			ps.setString(2, bean.getPassword());
			ps.setString(3, bean.getName());
			ps.setInt(4, bean.getIncorrectAttempts());
			ps.setInt(5, bean.getLockStatus());
			ps.setString(6, bean.getUserType());
			
			if(ps.executeUpdate()>0)
				return "Success";
			return "Fail";
		}
		return "Fail";
	}
	
	public static ArrayList<UserBean> getUsers(String userType) throws ClassNotFoundException, SQLException
	{
		/*
		 * Create a method ArrayList<UserBean> getUsers(String userType). This method should do the following operation. 
		 * a) Create User Bean with following private variables (ID, Password, Name, Incorrect Attempts, Lock Status, User Type) and initialize getters and setters. 
		 * b) Obtain the Connection Object by calling the getConnection() method. 
		 * c) Using the Connection Object, retrieve the records of specified user-type and store it into array 
		 * 		list and return. Note: Use the method parameter and extract the user records of the specified user type. 
		 * d) Create a main method call the getUsers method and print the values obtained.
		 */
		ArrayList<UserBean> list = new ArrayList<UserBean>();
		Connection con = new GetConnection().getConnection();
		PreparedStatement ps = con.prepareStatement("Select * from Users where UserType = ?");
		ps.setString(1, userType);
		
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			UserBean user = new UserBean();
			user.setId(rs.getString(1));
			user.setPassword(rs.getString(2));
			user.setName(rs.getString(3));
			user.setIncorrectAttempts(rs.getInt(4));
			user.setLockStatus(rs.getInt(5));
			user.setUserType(rs.getString(6));
			list.add(user);
		}
		return list;
	}
	
	public static ArrayList<UserBean> storeAllRecords() throws ClassNotFoundException, SQLException
	{
		/*
		 * Create a method ArrayList<UserBean> storeAllRecords(). This method should do the following operation. 
		 * a) Create User Bean with following private variables (ID, Password, Name, Incorrect Attempts, Lock Status, User Type) and initialize getters and setters. 
		 * b) Obtain the Connection Object by calling the getConnection() method. 
		 * c) Using the Connection Object, retrieve all the records and store it into array list. 
		 * d) Create a main method call the storeAllRecords method and print the values obtained.
		 */
		
		ArrayList<UserBean> list = new ArrayList<UserBean>();
		Connection con = new GetConnection().getConnection();
		Statement s = con.createStatement();
		
		ResultSet rs = s.executeQuery("Select * from Users");
		while(rs.next())
		{
			UserBean user = new UserBean();
			user.setId(rs.getString(1));
			user.setPassword(rs.getString(2));
			user.setName(rs.getString(3));
			user.setIncorrectAttempts(rs.getInt(4));
			user.setLockStatus(rs.getInt(5));
			user.setUserType(rs.getString(6));
			list.add(user);
		}
		return list;
	}
	
	public static String[] getNames() throws ClassNotFoundException, SQLException
	{
		/*
		 * Create a method String[] getNames(). This method should do the following operation. 
		 * a) Create User Bean with following private variables (ID, Password, Name, Incorrect Attempts, Lock Status, User Type) and initialize getters and setters. 
		 * b) Obtain the Connection Object by calling the getConnection() method. 
		 * c) Using the Connection Object, retrieve all names from the table and store it into string array. 
		 * d) Create a main method call the getNames method and print the values obtained. *****
		 */
		ArrayList<UserBean> list = storeAllRecords();
		String[] names = new String[list.size()];
		int i = 0;
		for(UserBean user: list)
			names[i++] = user.getName();
		return names;
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		/*
		 * Create table Users(UserID varchar(200), Password varchar(200), 
		 * Name varchar(200), IncorrectAttempts number(2), LockStatus number(2), 
		 * UserType varchar(200));
		 * 
		 * (AB1001, AB1001, Hari, 0, 0, Admin) 
		 * (TA1002, TA1002, Prasath, 0, 0, Employee) 
		 * (RS1003, RS1003, Ganesh, 0, 0, Employee)
		 */
		new CreateTableAndInsertData();
		
		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter userid to get usertype :");
//		String userId = sc.nextLine();
//		System.out.println("UserType of userID " + userId + " is :" + getUserType(userId));
//		
//		System.out.println("is incorrect attempts of userID " + userId + " ? :" + getIncorrectAttempts(userId));
//		
//		System.out.println("Change user type of userID " + userId + " is :" + changeUserType(userId));
//		
//		System.out.println("Get lock status count :" + getLockStatus());
//		
//		String name = "Manjot Singh";
//		System.out.println("Get status after name change of userID " + userId + " is:" + changeName(userId, name));
//		
//		String password = "ABC@0001";
//		System.out.println("After changing password of all Admins the status is :" + changePassword(password));
		
//		UserBean newUser = new UserBean();
//		newUser.setId("AB1002");
//		newUser.setPassword("Hello@1234");
//		newUser.setName("Navi");
//		newUser.setLockStatus(1);
//		newUser.setIncorrectAttempts(0);
//		newUser.setUserType("Employee");
////		
////		System.out.println("After insert of new user status :" + addUser_1(newUser));
//		
//		System.out.println("After insert of new user status with lockstatus is 1 :" + addUser_2(newUser));
		
		
		// Array list of all employees where UserType = "Employee"
//		ArrayList<UserBean> list = getUsers("Employee");
//		for(UserBean user: list)
//			System.out.println(user);
		
		// Array list of all employees
//		ArrayList<UserBean> list = storeAllRecords();
//		for(UserBean user: list)
//			System.out.println(user);
		
		// All users name
		String[] allUsersNames = getNames();
		for(String name: allUsersNames)
			System.out.println(name);
		sc.close();
	}
}
