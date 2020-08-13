package javaFundamentals;

import java.util.Scanner;

public class Arrays4 
{
	public static void main(String[] args)
	{
		// Enter ascii values and print corresponding chr values
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size and elements :");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		System.out.println("Char values are as follow :");
		for(int i = 0; i < n; i++)
			System.out.print((char)arr[i] + " ");
		
		System.out.println("\nAll ascii values :");
		for(int i=0;i<128;i++)
			System.out.print(i + " -> " + (char)i + "\t");
		sc.close();
	}
}
