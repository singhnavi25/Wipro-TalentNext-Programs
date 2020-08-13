package oopsAndInheritance;

import java.util.Scanner;

public class StringAndStringBuffer12 
{
	public static String Repeater(String s, int n)
	{
		if(n<1)
			return "";
		return s + Repeater(s, n-1);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string :");
		String str = sc.next();
		System.out.print("Enter a number :");
		int n = sc.nextInt();
		System.out.println(Repeater(str.substring(str.length()-n), n));
		sc.close();
	}
}
