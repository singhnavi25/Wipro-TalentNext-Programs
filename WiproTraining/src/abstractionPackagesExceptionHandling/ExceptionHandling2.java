package abstractionPackagesExceptionHandling;

import java.util.Scanner;

public class ExceptionHandling2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int number = sc.nextInt();
		
		System.out.println("Enter the numbers in the array");
		int[] array = new int[number];
		for(int i=0; i<number; i++)
			array[i] = sc.nextInt();
		
		try
		{
			System.out.println("Enter the index of the array element you want to access");
			int index = sc.nextInt();
			System.out.println("The array element at index " + index +" = " + array[index]);
			System.out.println("The array element successfully accessed");
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			// TODO: handle exception
//			System.out.println(e.getClass());
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		}
		sc.close();
	}
}
