package javaFundamentals;

import java.util.Scanner;

public class FlowControlStmts1 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check +ive, -ive or zero :");
		int n = sc.nextInt();
		if(n > 0)
			System.out.println(n + " is Positive");
		else if(n < 0)
			System.out.println(n + " is Negative");
		else
			System.out.println(n + " is Zero");
		
		System.out.print("Enter two +ive numbers to check last digits :");
		int first = sc.nextInt();
		int second = sc.nextInt();
		if(first%10 == second%10)
			System.out.println(true);
		else
			System.out.println(false );
		sc.close();
	}
}
