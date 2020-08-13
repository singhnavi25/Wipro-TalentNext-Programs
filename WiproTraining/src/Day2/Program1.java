package Day2;

import java.util.Scanner;

public class Program1 
{
	public static void main(String[] args)
	{
		// check interger value is +ive, -ive or zero
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any value :");
		int number = sc.nextInt();
		if(number>0)
			System.out.println("Positive number");
		else if(number<0)
			System.out.println("Negative number");
		else
			System.out.println("Number is zero");
		sc.close();
	}
}
