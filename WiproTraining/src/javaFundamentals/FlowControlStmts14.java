package javaFundamentals;

import java.util.Scanner;

public class FlowControlStmts14 
{
	public static void main(String[] args)
	{
		//digit sum
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int number = sc.nextInt();
		int sum = 0;
		for(int i = number; i > 0; i = i/10)
			sum += i%10;
		System.out.println(number + "->" + sum);
		sc.close();
	}
}
