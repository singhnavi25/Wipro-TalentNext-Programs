package javaFundamentals;

import java.util.Scanner;

public class FlowControlStmts16 
{
	public static void main(String[] args)
	{
		// reverse a number
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int number = sc.nextInt();
		String num = number + "";
		String rev = "";
		int n = num.length()-1;
		while(n >= 0)
		{
			rev += num.charAt(n);
			n--;
		}
		System.out.println(rev);
		sc.close();
	}
}
