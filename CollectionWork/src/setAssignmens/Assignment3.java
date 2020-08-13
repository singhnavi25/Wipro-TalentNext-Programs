package setAssignmens;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Assignment3 
{
	/*
	 * Create Collection called TreeSet which is capable of storing String objects. 
	 * The Collection should have the following capabilities
	 * a)Reverse the elements of the Collection 
	 * b)Iterate the elements of the TreeSet 
	 * c) Checked if a particular element exists or not
	 */
	public static void main(String[] args) 
	{
		// For revrse 
		Set<String> objects = new TreeSet<String>(Collections.reverseOrder());
		objects.add("Manjot");
		objects.add("Navi");
		objects.add("Noor");
		objects.add("Manu");
		objects.add("Komal");
		objects.add("Harsh");
		
		for(Iterator<String> itr = objects.iterator(); itr.hasNext(); )
			System.out.println(itr.next() + " ");
		System.out.println();
		
		String checkString = "Manu";
		for(String obj: objects)
			if(obj.equalsIgnoreCase(checkString))
			{
				System.out.println(checkString + " is found");
				return;
			}
		System.out.println(checkString + "is not found");
		
	}
}
