package project1ManageEmployeeDetails;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class EmployeeDetailsMainMethod 
{
	public static void main(String[] args) 
	{
		List<EmployeeDetails> empDetails = new LinkedList<EmployeeDetails>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Employees");
		int size = sc.nextInt();
		EmployeeDetails emp = null;
		for(int i=0; i<size; i++)
		{
			emp = new EmployeeDetails();
			System.out.println("Enter Employee " + (i+1)+ " Details:");
			System.out.println("Enter the Firstname");
			emp.setFirstName(sc.next());
			System.out.println("Enter the Lastname");
			emp.setLastName(sc.next());
			System.out.println("Enter the Mobile");
			emp.setMobile(sc.nextLong());
			System.out.println("Enter the Email");
			emp.setEmail(sc.next());
			System.out.println("Enter the Address");
			emp.setAddress(sc.next());
			empDetails.add(emp);
		}
		
		Collections.sort(empDetails);
			
		System.out.println("Employee List:");
		System.out.format("%-15s %-15s %-15s %-30s %-30s\n", "Firstname", "Lastname", "Mobile", "Email", "Address");
		for(EmployeeDetails itr : empDetails)
		{
			System.out.format("%-15s %-15s %-15s %-30s %-15s\n", itr.getFirstName(), itr.getLastName(), itr.getMobile(), itr.getEmail(), itr.getAddress());
			System.out.println();
		}
	}
}
