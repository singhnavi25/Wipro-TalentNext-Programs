package javaFundamentals;

import java.util.Scanner;

public class FlowControlStmts7 
{
	public static void main(String[] args)
	{
		// char lower to uppercase and vice-versa
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a alphabetic char :");
		char ch = sc.next().charAt(0);
		if(Character.isLowerCase(ch))
			System.out.println(ch + "->" + Character.toUpperCase(ch));
		else
			System.out.println(ch + "->" + Character.toLowerCase(ch));
		sc.close();
	}
}
