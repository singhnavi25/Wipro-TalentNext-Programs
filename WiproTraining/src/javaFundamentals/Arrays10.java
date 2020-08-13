package javaFundamentals;

import java.util.Scanner;

public class Arrays10 
{
	public static void main(String[] args)
	{
		// print even number first and print odd number at last
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size and elements :");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		int[] temp = new int[n];
		int i = 0;
		int j = arr.length - 1;
		for(int val: arr)
		{
			if(val%2 == 1) 
				temp[j--] = val;
			else
				temp[i++] = val;
		}
		System.out.println("After change :");
		for(i=0; i<n; i++)
			System.out.print(temp[i] + " ");
		sc.close();
	}
}
