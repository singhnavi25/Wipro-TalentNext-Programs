package oopsAndInheritance;

import java.util.Scanner;

public class StringAndStringBuffer3 
{
	public static String Copies(String str, int n)
	{
		if(n<1)
			return "";
		return str + Copies(str, n-1);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string for copies :");
		String cop = sc.next();
		System.out.println(Copies(cop.substring(0, 2), cop.length()));
		sc.close();
	}
}
