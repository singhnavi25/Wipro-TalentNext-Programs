package javaFundamentals;

import java.util.Scanner;

public class Arrays2 
{
	public static void main(String[] args)
	{
		// Find min and max in array
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size and elements :");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++)
		{
			if(min > arr[i])
				min = arr[i];
			if(max < arr[i])
				max = arr[i];
		}
		System.out.println("Min is :" + min);
		System.out.println("Max is :" + max);
		sc.close();
	}
}
