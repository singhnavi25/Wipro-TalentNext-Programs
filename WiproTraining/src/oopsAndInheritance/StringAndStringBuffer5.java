package oopsAndInheritance;

import java.util.Scanner;

public class StringAndStringBuffer5 
{
	public static String Maker(String str)
	{
		return str.substring(1, str.length());
	}
	public static void main(String[] args) 
	{
		/*
		 *Given a string, return a version without 
		 *the first and last char, so "Wipro" yields 
		 *"ipr". The string length will be at least 2.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string for half :");
		String str = sc.next();
		System.out.println(Maker(str));
		sc.close();
	}
}
