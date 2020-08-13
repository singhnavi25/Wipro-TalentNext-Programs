package mapAssignments;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.Map.Entry;

public class Assignment3 
{
	/*
	 * Write a program that will have a Properties class which is capable of storing some States of India 
	 * and their Capital. Use an Iterator to list all the elements of the Properties.
	 */
	public static void main(String[] args) 
	{
		Properties M1 = new Properties();
		M1.put("Japan", "Tokyo");
		M1.put("Qatar", "Doha");
		M1.put("India", "New Delhi");
		M1.put("Canada", "Ottawa");
		M1.put("Russia", "Moscow");
		
		Set<Entry<Object, Object>> set = M1.entrySet();
		Iterator<Entry<Object, Object>> itr = set.iterator();
		while(itr.hasNext())
		{
			Entry<Object, Object> temp =  itr.next();
			System.out.println(temp.getKey() + " - > " + temp.getValue());
		}
	}
}
