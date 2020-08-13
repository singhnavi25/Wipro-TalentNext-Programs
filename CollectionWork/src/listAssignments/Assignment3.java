package listAssignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Assignment3 
{
	/*
	 * Create an ArrayList which will be able to store only Strings. 
	 * Create a printAll method which will print all the elements using an Iterator.
	 */
	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<String>();
		list.add("Manjot Singh");
		list.add("Navi Singh");
		list.add("Komal");
		list.add("Noor");
		list.add("Manu");
		list.add("Harsh");
		
		printAll(list);
	}
	
	static void printAll(List<String> list)
	{
		Iterator<String> itr = list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}
