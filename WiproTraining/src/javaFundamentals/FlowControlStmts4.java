package javaFundamentals;

import java.util.Scanner;

public class FlowControlStmts4 
{
	public static void main(String[] args)
	{
		// char in alphabetical order
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two chars :");
		char first = sc.next().charAt(0);
		char second = sc.next().charAt(0);
		if(first > second)
			System.out.println(second + ", " + first);
		else
			System.out.println(first + ", " + second);
		sc.close();
	}
}
