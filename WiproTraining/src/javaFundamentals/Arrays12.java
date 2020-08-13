package javaFundamentals;

import java.util.Scanner;

public class Arrays12 
{
	public static void main(String[] args)
	{
		// print middle of two arrays
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size and elements of first array :");
		int n1 = sc.nextInt();
		int[] arr1 = new int[n1];
		for(int i = 0; i < n1; i++)
			arr1[i] = sc.nextInt();
		
		System.out.print("Enter array size and elements of second array :");
		int n2 = sc.nextInt();
		int[] arr2 = new int[n2];
		for(int i = 0; i < n2; i++)
			arr2[i] = sc.nextInt();
		
		int[] mid = new int[2];
		mid[0] = arr1[arr1.length / 2];
		mid[1] = arr2[arr2.length / 2];
		System.out.println("Both array mid is " + mid[0] + " and " + mid[1]);
		sc.close();
	}
}
