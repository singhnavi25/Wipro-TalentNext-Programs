package javaFundamentals;

import java.util.Scanner;

public class Arrays8 
{
	public static void main(String[] args)
	{
		// print the sum except elements b/w 6 and 7
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size and elements :");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		boolean flag = true;
		int sum = 0;
		int tempSum = 0;
		for(int i: arr)
		{
			if(i == 6)
			{
				tempSum += i;
				flag = false;
			}
			else if(i == 7 && flag == false)
			{
				tempSum = 0;
				flag = true;
			}
			else if(flag == true)
				sum += i;
		}
		if(flag == false)
			sum += tempSum;
		System.out.println("Sum is :" + sum);
		sc.close();
	}
}
