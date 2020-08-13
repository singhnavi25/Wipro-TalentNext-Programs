package project2StringOperations;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class StringOperations 
{
	List<String> list = null;
	
	public StringOperations() 
	{
		super();
		list = new LinkedList<String>();
	}
	public void insert(String item)
	{
		list.add(item);
		System.out.println("Inserted successfully");
	}
	public void search(String item)
	{
		if(list.contains(item))
			System.out.println("Item found in the list.");
		else
			System.out.println("Item not found in the list.");
	}
	public void delete(String item)
	{
		if(list.contains(item))
		{
			list.remove(item);
			System.out.println("Deleted successfully");
		}
		else
			System.out.println("Item does not exist.");
	}
	
	public void display()
	{
		for(Iterator<String> itr = list.iterator(); itr.hasNext(); )
			System.out.println(itr.next());
	}
}
