package javaFundamentals;

import java.util.Scanner;

public class Arrays1 
{
	public static void main(String[] args)
	{
		// Find sum and average of all array elements
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size and elements :");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		int sum = 0;
		for(int i = 0; i < n; i++)
			sum += arr[i];
		System.out.println("Sum is :" + sum);
		System.out.println("Average is :" + sum/n);
		sc.close();
	}
}
