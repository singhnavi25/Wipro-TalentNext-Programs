package listAssignments;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Assignment8 
{
	/*
	 * Write a program that will have a Vector which is capable of storing emp objects. 
	 * Use an Iterator and enumeration to list all the elements of the Vector.
	 */
	public static void main(String[] args) 
	{
		Vector<Employee> vectorList = new Vector<Employee>();
		vectorList.add(new Employee(1001, "Manjot Singh", 20000, "SBNR, Sri Ganganagar"));
		vectorList.add(new Employee(1002, "Navi Singh", 30000, "Anupgarh, Sri Ganganagar"));
		vectorList.add(new Employee(1003, "Harsh Singh", 10000, "Ramsingh Pur, Sri Ganganagar"));
		vectorList.add(new Employee(1004, "Noor", 50000, "Raisingh Nagar, Sri Ganganagar"));
		vectorList.add(new Employee(1005, "Komal", 25000, "Suratgarh, Sri Ganganagar"));
		
		// Using iterator
		Iterator<Employee> itr = vectorList.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		System.out.println();
		
		// Using enumeration
		Enumeration<Employee> enm = Collections.enumeration(vectorList);
		while(enm.hasMoreElements())
			System.out.println(enm.nextElement());
	}
}
