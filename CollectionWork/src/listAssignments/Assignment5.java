package listAssignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment5 
{
	/*
	 * Create an ArrayList of Employee( id,name,address,sal) objects and 
	 * search for particular Employee object based on id number.
	 */
	
	public static void main(String[] args) 
	{
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1001, "Manjot Singh", 20000, "SBNR, Sri Ganganagar"));
		list.add(new Employee(1002, "Navi Singh", 30000, "Anupgarh, Sri Ganganagar"));
		list.add(new Employee(1003, "Harsh Singh", 10000, "Ramsingh Pur, Sri Ganganagar"));
		list.add(new Employee(1004, "Noor", 50000, "Raisingh Nagar, Sri Ganganagar"));
		list.add(new Employee(1005, "Komal", 25000, "Suratgarh, Sri Ganganagar"));
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Employee Id to be search :");
		int searchEmpId = sc.nextInt();
		sc.close();
		for(Employee e: list)
			if(e.getEmpId() == searchEmpId)
			{
				System.out.println(e);
				return;
			}
		System.out.println("Employee with " + searchEmpId + " is not present.");
	}
}
