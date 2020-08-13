package mapAssignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Assignment2 
{
	/*
	 * Create a Collection called HashMap which is capable of storing String objects. 
	 * The program should have the following abilities
	 * a) Check if a particular key exists or not 
	 * b) Check if a particular value exists or not 
	 * c) Use Iterator to loop through the map key set
	 */
	public static void main(String[] args) 
	{
		HashMap<String, String> M1 = new HashMap<String, String>();
		M1.put("Japan", "Tokyo");
		M1.put("Qatar", "Doha");
		M1.put("India", "New Delhi");
		M1.put("Canada", "Ottawa");
		M1.put("Russia", "Moscow");
		
		// ability a
		String checkingKey = "Canada";
		if(M1.containsKey(checkingKey))
			System.out.println("The key is present");
		else
			System.out.println("The key is not present");
		
		// ability b
		String checkingValue = "xyz";
		if(M1.containsValue(checkingValue))
			System.out.println("The value is present");
		else
			System.out.println("The value is not present");
		
		// ability c
		// using for each
		M1.forEach((key, value) -> System.out.println(key + " - > " + value));
		System.out.println();
		
		// using iterator
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> itr = set.iterator();
		while(itr.hasNext())
		{
			Map.Entry<String, String> temp =  itr.next();
			System.out.println(temp.getKey() + " - > " + temp.getValue());
		}
	}
}
