package junitTests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;


public class JUnitTests2 
{
	@Test
	public void testFindName() 
	{
		ArrayList<String> list = new ArrayList<>();
		{
			list.add("Manjot");
			list.add("Navi");
			list.add("Hello");
		}
		System.out.println(list);
		assertEquals("Result fail Reason","FOUND", new Employee().findName(list, "Navi"));
		System.out.println("test");
	}


}
