package oopsAndInheritance;

import java.util.Scanner;

public class StringAndStringBuffer2 
{
	public static void main(String[] args) 
	{
		/*
		 *  Given two strings, append them together 
		 *  (known as "concatenation") and 
		 *  return the result. 
		 *  However, if the concatenation creates a 
		 *  double-char, then omit one of the chars. 
		 *  If the inputs are “Mark” and “Kate” then 
		 *  the ouput should be “markate”. 
		 *  (The output should be in lowercase)
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two string for concatenation :");
		String first = sc.next();
		String second = sc.next();
		first = first.toLowerCase();
		second = second.toLowerCase();
		String ans;
		if(first.charAt(first.length()-1) == second.charAt(0))
			ans = first + second.substring(1);
		else
			ans = first + second;
		System.out.println(ans);
		sc.close();
	}
}
