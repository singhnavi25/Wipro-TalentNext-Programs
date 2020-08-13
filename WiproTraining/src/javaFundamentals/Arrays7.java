package javaFundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays7 
{
	public static void main(String[] args)
	{
		// remove duplicate numbers from array
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size and elements :");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		Arrays.sort(arr);
		int[] temp = new int[n];
		int x = 0;
		for(int i=0;i<n-1;i++)
		{
			if(arr[i] != arr[i+1])
				temp[x++] = arr[i];
		}
		temp[x] = arr[n-1];
		System.out.println("After removing duplicate items :");
		for(int i=0; i<=x ; i++)
			System.out.print(temp[i] + " ");
		sc.close();
	}
}
