package javaFundamentals;

import java.util.Scanner;

public class Arrays6 
{
	public static void main(String[] args)
	{
		// Sort the array
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size and elements :");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		for (int i = 0; i < n; i++) 
		{     
            for (int j = i+1; j < n; j++) 
            {     
               if(arr[i] > arr[j]) 
               {    
                   int temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
		
		System.out.println("After sort array is :");
		for(int i=0;i<128;i++)
			System.out.print(arr[i] + " ");
		sc.close();
	}
}
