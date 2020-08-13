package mapAssignments;

import java.util.HashMap;

public class Assignment4 
{
	/*
	 *  Write a program to create a HashMap to store name and phone number (Telephone book). 
	 *  When name is given, we can get back the corresponding phone number.
	 */
	public static void main(String[] args) 
	{
		HashMap<String, Long> telephoneBook = new HashMap<String, Long>();
		telephoneBook.put("Manjot Singh", (long) 2323115);
		telephoneBook.put("Navi", (long) 3323112);
		telephoneBook.put("Noor", (long) 2323112);
		telephoneBook.put("Komal", (long) 2303112);
		telephoneBook.put("Harsh", (long) 2313112);
		
		String name = "Komal";
		if(telephoneBook.containsKey(name))
			System.out.println("Komal's mobile number is :" + telephoneBook.get(name));
		else
			System.out.println("Komal's mobile number is not present");
	}
}
