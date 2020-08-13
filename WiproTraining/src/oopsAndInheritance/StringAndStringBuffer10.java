package oopsAndInheritance;

import java.util.Scanner;

public class StringAndStringBuffer10
{
	public static void main(String[] args) 
	{
		/*
		 * Given two strings, a and b,
		 * create a bigger string made of the first 
		 * char of a, the first char of b, the second 
		 * char of a, the second char of b, and so on. 
		 * Any leftover chars go at the end of the 
		 * result.
		 * If the inputs are "Hello" and "World", 
		 * then the output is "HWeolrllod".
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 strings :");
		String first = sc.next();
		String second = sc.next();
		int i = 0;
		int j = 0;
		String ans = "";
		while(i < first.length() && j < second.length())
		{
			ans += first.charAt(i++);
			ans += second.charAt(j++);
		}
		if(i < first.length())
			ans += first.substring(i, first.length());
		if(j < second.length())
			ans += second.substring(j, second.length());
		System.out.println(ans);
		sc.close();
	}
}
