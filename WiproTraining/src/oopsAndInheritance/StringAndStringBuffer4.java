package oopsAndInheritance;

import java.util.Scanner;

public class StringAndStringBuffer4 
{
	public static String Half(String half)
	{
		if(half.length() %2 == 0)
			return half.substring(0, half.length()/2);
		return null;
	}
	public static void main(String[] args) 
	{
		/*
		 * Given a string of even length, 
		 * return the first half. 
		 * So the string "CatDog" yields "Cat". 
		 * If the string length is odd number then 
		 * return null.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string for half :");
		String half = sc.next();
		System.out.println(Half(half));
		sc.close();
	}
}
