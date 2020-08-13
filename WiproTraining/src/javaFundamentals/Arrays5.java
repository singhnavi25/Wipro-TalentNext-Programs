package javaFundamentals;

import java.util.Scanner;

public class Arrays5 
{
	public static void main(String[] args)
	{
		// Find min 2 and max 2 elements in array
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size and elements :");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		int min1 = Integer.MAX_VALUE -1 ;
		int min2 = Integer.MAX_VALUE;
		int max1 = Integer.MIN_VALUE+1;
		int max2 = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++)
		{
			if(min1 > arr[i] || min2 > arr[i])
			{
				if(min1 > arr[i])
				{
					min2 = min1;
					min1 = arr[i];
				}
				if(min2 > arr[i] && min1!=arr[i])
					min2 = arr[i];
			}
			if(max1 < arr[i] || max2 < arr[i])
			{
				if(max1 < arr[i])
				{
					max2 = max1;
					max1 = arr[i];
				}
				if(max2 < arr[i] && max1!=arr[i])
					max2 = arr[i];
			}
		}
		System.out.println("First min is :" + min1);
		System.out.println("Second min is :" + min2);
		System.out.println("First max is :" + max1);
		System.out.println("Second max is :" + max2);
		sc.close();
	}
}
