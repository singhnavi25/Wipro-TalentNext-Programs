package abstractionPackagesExceptionHandling;

import java.util.InputMismatchException;

public class ExceptionHandling4
{
	/*
	 *Write a class MathOperation which accepts integers from command line. 
	 *Create an array using these parameters. Loop through the array and obtain
	 *the sum and average of all the elements. 
	 *Display the result. 
	 *Check for various exceptions that may arise like ArithmeticException, NumberFormatException, and so on.
	 *For example: The class would be invoked as follows: 
	 *C:>java MathOperation 1900, 4560, 0, 32500
	 */
	public static void main(String[] args) 
	{
		int[] array = new int[args.length];
		try
		{
			int sum = 0;
			for(int i=0; i<args.length; i++)
			{
				if(args[i].charAt(args[i].length() - 1) == ',')
					array[i] = Integer.parseInt(args[i].substring(0, args[i].length() - 1));
				else
					array[i] = Integer.parseInt(args[i]);
				sum += array[i];
			}
			int avg = sum / args.length;
			System.out.println("Sum of array is: " + sum + " and average is :" + avg);
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException");
		}
		catch(InputMismatchException e)
		{
			System.out.println("InputMismatchException");
		}
		catch(NumberFormatException e)
		{
			System.out.println("NumberFormatException");
		}
	}
}
