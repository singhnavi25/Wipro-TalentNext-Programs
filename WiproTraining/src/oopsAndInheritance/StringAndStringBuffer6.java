package oopsAndInheritance;

import java.util.Scanner;

public class StringAndStringBuffer6 
{
	public static void main(String[] args) 
	{
		/*
		 * Given 2 strings, a and b, 
		 * return a string of the form 
		 * short+long+short, with the shorter 
		 * string on the outside and the longer 
		 * string on the inside. 
		 * The strings will not be the same length, 
		 * but they may be empty (length 0). 
		 * If input is "hi" and "hello", then output 
		 * will be "hihellohi".
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two string :");
		String first = sc.next();
		String second = sc.next();
		if(first.length() > second.length())
			System.out.println(second + first + second);
		else
			System.out.println(first + second + first);
		sc.close();
	}
}
