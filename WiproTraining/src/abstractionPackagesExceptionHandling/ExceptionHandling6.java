package abstractionPackagesExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

class NegativeValuesException extends Exception 
{
	String s;
	public NegativeValuesException() 
	{
		System.out.println("NegativeValuesException occured");
	}
	public String toString()
	{
		return s;
	}
}
class ValuesOutOfRangeException extends Exception 
{
	String s;
	public ValuesOutOfRangeException() 
	{
		System.out.println("ValuesOutOfRangeException occured");
	}
	public String toString()
	{
		return s;
	}
}
public class ExceptionHandling6 
{
	/*
	 * Write a Program to take care of Number Format Exception if user 
	 * enters values other than integer for calculating average marks of 2 students. 
	 * The name of the students and marks in 3 subjects are taken from the user while executing the program.
	 * In the same Program write your own Exception classes to take care of Negative values 
	 * and values out of range (i.e. other than in the range of 0-100)
	 */
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<2; i++)
		{
			String name;
			int sub1;
			int sub2;
			int sub3;
			try
			{
				System.out.println("Enter the name of the student :");
				name = sc.next();
				
				System.out.println("Enter three subject marks :");
				sub1 = sc.nextInt();
				if(sub1 < 0)
					throw new NegativeValuesException();
				if(sub1>100)
					throw new ValuesOutOfRangeException();
				sub2 = sc.nextInt();
				if(sub2 < 0)
					throw new NegativeValuesException();
				if(sub2>100)
					throw new ValuesOutOfRangeException();
				sub3 = sc.nextInt();
				if(sub3 < 0)
					throw new NegativeValuesException();
				if(sub3>100)
					throw new ValuesOutOfRangeException();
				
				System.out.println("The name of the student is :" + name);
				System.out.println("First subject marks are :" + sub1);
				System.out.println("Second subject marks are :" + sub2);
				System.out.println("Thirs subject marks are :" + sub3);
			}
			catch(InputMismatchException e)
			{
				System.out.println(e.getMessage());
			}
			catch(NegativeValuesException e)
			{
			}
			catch(ValuesOutOfRangeException e)
			{
			}
		}
		sc.close();
	}
}
