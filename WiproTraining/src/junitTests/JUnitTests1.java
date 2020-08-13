package junitTests;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;



public class JUnitTests1 
{

	@Test
	public void testStringConcat() 
	{
		MyUnit myUnit = new MyUnit();
		assertEquals("ManjotSingh", myUnit.stringConcat("Manjot", "Singh"));
	}
	@Test
	public void testSortVales()
	{
		int[] expected = {1,  2, 3};
		int[] actual = {3, 2, 1};
		assertArrayEquals(expected, new MyUnit().sortValues(actual));
	}
	@Test
	public void testtCheckPresence()
	{
		assertTrue(new MyUnit().checkPresence("Manjot", "j"));
	}
}
