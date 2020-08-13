package junitTests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class JUnitTests3 
{

	@Test
	public void testCheckPalindrome1() 
	{
		assertTrue(new MyUnit1().checkPalindrome("madam"));
	}
	@Test
	public void testCheckPalindrome2() 
	{
		assertFalse(new MyUnit1().checkPalindrome("Madam"));
	}
	
}
