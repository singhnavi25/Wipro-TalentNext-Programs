package junitTests;

public class MyUnit1 
{
	public boolean checkPalindrome(String str)
	{
		int i = 0;
		int j = str.length()-1;
		while(i < j)
			if(str.charAt(i++) != str.charAt(j--))
				return false;
		return true;
	}
}
