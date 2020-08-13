package setAssignmens;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Assignment2 
{
	/* Write a program to store a group of employee names into a HashSet, 
	 * retrieve the elements one by one using an Iterator.
	 */
	public static void main(String[] args) 
	{
		Set<String> employeeNames = new HashSet<String>();
		employeeNames.add("Manjot");
		employeeNames.add("Manu");
		employeeNames.add("Noor");
		employeeNames.add("Komal");
		employeeNames.add("Harsh");
		
		for(Iterator<String> itr = employeeNames.iterator(); itr.hasNext(); )
			System.out.println(itr.next());
	}
}
