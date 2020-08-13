package Day2;

import java.util.Scanner;

public class Program3 
{
	public static void main(String[] args)
	{
		// check interger value is odd or even
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any value :");
		int number = sc.nextInt();
		if(number%2 == 1)
			System.out.println("Odd");
		else
			System.out.println("Even");
		sc.close();
	}
}
