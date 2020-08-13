package javaFundamentals;

import java.util.Scanner;

public class FlowControlStmts12 
{
	public static void main(String[] args)
	{
		// print number is prime or not
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int number = sc.nextInt();
		boolean flag = true;
		if(number != 2 && number != 3)
			for(int i = 2; i<=(int)Math.sqrt(number) ;i++)
				if(number%i==0)
					flag = false;
		if(flag)
			System.out.println(number + " is prime");
		else
			System.out.println(number + " is not prime");
		sc.close();
	}
}
