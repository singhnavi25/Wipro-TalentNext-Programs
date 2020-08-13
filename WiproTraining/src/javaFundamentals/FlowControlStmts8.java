package javaFundamentals;

import java.util.Scanner;

public class FlowControlStmts8 
{
	public static void main(String[] args)
	{
		// print color on the alphabetic char values
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a alphabetic char code :");
		char ch = sc.next().charAt(0);
		switch (ch) 
		{
			case 'R':
				System.out.println("Red"); break;
			case 'B':
				System.out.println("Blue"); break;
			case 'G':
				System.out.println("Green"); break;
			case 'O':
				System.out.println("Orange"); break;
			case 'Y':
				System.out.println("Yellow"); break;
			case 'W':
				System.out.println("White"); break;
			default:
				System.out.println("Invalid Code");
		}
		sc.close();
	}
}
