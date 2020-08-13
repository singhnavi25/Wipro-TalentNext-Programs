package Day2;

import java.util.Scanner;

public class Program2 
{
	public static void main(String[] args)
	{
		// print greater from two
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any two values :");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		if(number1 > number2)
			System.out.println(number1);
		else
			System.out.println(number2);
		sc.close();
	}
}
