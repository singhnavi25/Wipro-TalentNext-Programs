package oopsAndInheritance;

import java.util.Scanner;

public class StringAndStringBuffer1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string to check palindrome :");
		String plString = sc.next();
		plString = plString.toLowerCase();
		int i = 0;
		int j = plString.length()-1;
		boolean flag = true;
		while(i < j)
		{
			if(plString.charAt(i) != plString.charAt(j))
			{
				flag = false;
				break;
			}
			i++;
			j--;
		}
		if(flag)
			System.out.println("Palindrome");
		else
			System.out.println("Not palindrome");
		sc.close();
	}
}
