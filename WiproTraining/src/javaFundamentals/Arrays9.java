package javaFundamentals;

import java.util.Scanner;

public class Arrays9 
{
	public static void main(String[] args)
	{
		// remove 10 from array and left shif array
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size and elements :");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		int[] temp = new int[n];
		int x = 0;
		for(int i: arr)
			if(i!=10)
				temp[x++] = i;
		System.out.println("Afte removing all 10 :");
		for(int i = 0;i<n; i++)
			System.out.print(temp[i] + " ");
		sc.close();
	}
}
