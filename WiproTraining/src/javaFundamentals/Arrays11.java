package javaFundamentals;

import java.util.Scanner;

public class Arrays11 
{
	public static void main(String[] args)
	{
		// check array's all elements are only 1 and 4
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size and elements :");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		boolean ans = true;
		for(int i: arr)
			if(i!=4 && i!=1)
			{
				ans = false;
				break;
			}
		System.out.println(ans);
		sc.close();
	}
}
