package Day2;

import java.util.Scanner;

public class Program4 
{
	public static void main(String[] args)
	{
		// two integers sum is odd or even
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any two values :");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		if((number1 + number2)%2 == 1)
			System.out.println("Odd");
		else
			System.out.println("Even");
		sc.close();
	}
}
