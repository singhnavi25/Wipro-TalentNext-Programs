package oopsAndInheritance;

import java.util.Scanner;

public class StringAndStringBuffer8 
{
	public static void main(String[] args) 
	{
		/*
		 * Given two strings, word and a separator, 
		 * return a big string made of count 
		 * occurrences of the word, separated by the 
		 * separator string.
		 * if the inputs are "Wipro","X" and 3 
		 * then the output is "WiproXWiproXWipro".
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word :");
		String word = sc.next();
		System.out.print("Enter a seperator :");
		String separator = sc.next();
		System.out.print("Enter count :");
		int count = sc.nextInt();
		String ans = "";
		for(int i = 0; i<count; i++)
		{
			if(i == count-1)
				ans += word;
			else
				ans += word + separator;
		}
		System.out.println(ans);
		sc.close();
	}
}
