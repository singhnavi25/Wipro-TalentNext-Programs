import java.util.*;
class Employees
{
	private int empNo, basic, hra , it;
	private String empName, joinDate, department;
	private char designationCode;
	public Employees(int empNo, String empName, String joinDate, char designationCode, String department, int basic, int hra, int it) 
	{
		this.empNo = empNo;
		this.empName = empName;
		this.joinDate = joinDate;
		this.designationCode = designationCode;
		this.department = department;
		this.basic = basic;
		this.hra = hra;
		this.it = it;
	}
	public boolean check(int id)
	{
		if(empNo == id)
			return true;
		return false;
	}
	public void designation(char code)
	{
		switch(code)
		{
			case 'e':
				System.out.format("%-15s%-15s", "Engineer", basic + hra + 20000 - it);
				break;
			case 'c':
				System.out.format("%-15s%-15s", "Consultant", basic + hra + 32000 - it);
				break;
			case 'k':
				System.out.format("%-15s%-15s", "Clerk", basic + hra + 12000 - it);
				break;
			case 'r':
				System.out.format("%-15s%-15s", "Receptionist", basic + hra + 15000 - it);
				break;
			case 'm':
				System.out.format("%-15s%-15s", "Manager", basic + hra + 40000 - it);
				break;
		}
	}
	public void ans()
	{
		System.out.format("%-15s%-15s%-15s", empNo, empName, department);
		designation(designationCode);
	}
}
public class First_project 
{
	public static void main(String args[])
	{
		Employees emp[] = new Employees[10];
		emp[0] = new Employees(1001, "Ashish", "01/04/2009",  'e',  "R&D",  20000,  8000 ,3000);
		emp[1] = new Employees(1002, "Sushma", "23/08/2012", 'c', "PM", 30000, 12000, 9000);
		emp[2] = new Employees(1003, "Rahul", "12/11/2008", 'k', "Acct", 10000, 8000, 1000);
		emp[3] = new Employees(1004, "Chahat", "29/01/2013", 'r', "FrontDesk", 12000, 6000, 2000);
		emp[4] = new Employees(1005, "Ranjan", "16/07/2005", 'm', "Engg", 50000, 20000, 20000);
		emp[5] = new Employees(1006, "Suman" ,"1/1/2000" ,'e',"Manufacturing", 23000, 9000, 4400);
		emp[6] = new Employees(1007, "Tanmay", "12/06/2006", 'c', "PM", 29000, 12000, 10000);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter employee id :");
		int id = sc.nextInt();
		int i;
		for(i=0;i<7;i++)
		{
			if(emp[i].check(id))
				break;
		}
		if(i<7)
		{
			System.out.format("%-15s%-15s%-15s%-15s%-15s","Emp No","Emp Name","Department", "Designation", "Salary");
			System.out.println();
			emp[i].ans();
		}
		else
			System.out.println("There is no employee with empid : "+id);
	}
}