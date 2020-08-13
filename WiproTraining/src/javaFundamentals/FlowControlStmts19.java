package javaFundamentals;

import java.util.Scanner;

public class FlowControlStmts19 
{
	public static void main(String[] args)
	{
		// perform sub and add
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.print("1. Add 2. Sub\nEnter your choice :");
			int choice = sc.nextInt();
			System.out.print("Enter two numbers :");
			int first = sc.nextInt();
			int second = sc.nextInt();
			switch(choice)
			{
				case 1:
					System.out.println(first+second); break;
				case 2:
					System.out.println(first-second);
			}
			System.out.print("You wants to continue or not :");
			char ch = sc.next().charAt(0);
			if(ch == 'y' || ch == 'Y')
			{
				
			}
			else
				break;
		}
		sc.close();
	}
}
