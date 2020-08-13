package junitTests;

import java.util.ArrayList;

public class Employee 
{
	public String findName(ArrayList<String> employees, String name)
	{
		if(employees.contains(name))
			return "FOUND";
		return "NOT FOUND";
	}
}
