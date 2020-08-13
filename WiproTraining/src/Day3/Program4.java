package Day3;

import java.util.Scanner;

public class Program4 
{
	static int addLastDigit(int number1, int number2)
	{
		number1 = Math.abs(number1);
		number2 = Math.abs(number2);
		return (number1%10) + (number2%10);
	}
	public static void main(String[] args)
	{
		// return last digits of two numbers
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any two int values :");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		System.out.println(addLastDigit(number1, number2));
		sc.close();
	}
}
