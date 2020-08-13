package Projects;
public class Employees 
{
	public static int Designation(String h)
	{
		switch(h)
		{
			case "e":
				System.out.format("%-15s","Engineer");
				return 20000;
			case "c":
				System.out.format("%-15s","Consultant");
				return 32000;
			case "k":
				System.out.format("%-15s","Clerk");
				return 12000;
			case "r":
				System.out.format("%-15s","Receptionist");
				return 15000;
			case "m":
				System.out.format("%-15s","Manager");
				return 40000;
		}
		return 0;
	}
	public static void main(String[] args) 
	{
		String emp[][] = new String[][] {{"1001", "Ashish", "01/04/2009",  "e",  "R&D",  "20000",  "8000" ,"3000"},
			{"1002", "Sushma", "23/08/2012", "c", "PM", "30000", "12000", "9000"},
			{"1003", "Rahul", "12/11/2008", "k", "Acct", "10000", "8000", "1000"},
			{"1004", "Chahat", "29/01/2013", "r", "FrontDesk", "12000", "6000", "2000"},
			{"1005", "Ranjan", "16/07/2005", "m", "Engg", "50000", "20000", "20000"},
			{"1006", "Suman" ,"1/1/2000" ,"e","Manufacturing", "23000", "9000", "4400"},
			{"1007", "Tanmay", "12/06/2006", "c", "PM", "29000", "12000", "10000"}};
			
			String id = args[0];
			int i = 0;
			boolean flag = false;
			for(;i<emp.length;i++)
			{
				if(id.equals(emp[i][0]))
				{
					flag = true;
					break;
				}
			}
			if(flag)
			{
				System.out.format("%-15s%-15s%-15s%-15s%-15s","Empid","Emp Name","Department", "Designation", "Salary");
				System.out.println();
				System.out.format("%-15s%-15s%-15s", id, emp[i][1], emp[i][4]);
				int da = Designation(emp[i][3]);
				int sal = Integer.parseInt(emp[i][5]) + Integer.parseInt(emp[i][6]) + da - Integer.parseInt(emp[i][7]);
				System.out.format("%-15s",sal);
				System.out.println();
			}
			else
				System.out.println("There is no employee with empid "+id);
	}
}
