package oopsAndInheritance;

import java.util.Scanner;

public class StringAndStringBuffer7 
{
	public static String Removex(String s)
	{
		if(s.length() == 0)
			return null;
		if(s.charAt(0) == 'x')
			s = s.substring(1, s.length());
		if(s.charAt(s.length()-1) == 'x')
			s = s.substring(0, s.length()-1);
		if(s.length() == 0)
			return null;
		return s;
	}
	public static void main(String[] args) 
	{
		/*
		 * Given a string, if the first or last 
		 * chars are 'x', return the string without 
		 * those 'x' chars, and otherwise return 
		 * the string unchanged. If the input is 
		 * "xHix", then output is "Hi".
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two string :");
		String first = sc.next();
		System.out.println(Removex(first));
		sc.close();
	}
}
