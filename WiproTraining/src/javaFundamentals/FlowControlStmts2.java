package javaFundamentals;

import java.util.Scanner;

public class FlowControlStmts2 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int n = sc.nextInt();
		if(n%2==1)
			System.out.println(n + " is odd");
		else
			System.out.println(n + " is even");
		sc.close();
	}
}
