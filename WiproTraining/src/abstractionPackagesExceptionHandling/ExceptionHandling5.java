package abstractionPackagesExceptionHandling;

import java.util.Scanner;

public class ExceptionHandling5 
{
	/*
	 * Write a Program with a division method who receives two integer numbers and
	 * performs the division operation. The method should declare that it throws 
	 * ArithmeticException. This exception should be handled in the main method.
	 */
	public static double division(int first, int second) throws ArithmeticException
	{
		if(second == 0)
			throw new ArithmeticException("Divisior should not be zero.");
		return (double) first/second;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two integer values :");
		int first = sc.nextInt();
		int second = sc.nextInt();
		try
		{
			System.out.println("Divisio of " + first + "/" + second + " is :" + division(first, second));
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		sc.close();
	}
}
