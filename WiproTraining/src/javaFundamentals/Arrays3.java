package javaFundamentals;

import java.util.Scanner;

public class Arrays3 
{
	public static void main(String[] args)
	{
		// Search element and print index if not found print -1
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size and elements :");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		System.out.print("Enter element to search :");
		int val = sc.nextInt();
		int i = 0;
		for( ; i < n; i++)
			if(val == arr[i])
				break;
		if(i == n)
			System.out.println(-1);
		else
			System.out.println(i); // printing index
		sc.close();
	}
}
