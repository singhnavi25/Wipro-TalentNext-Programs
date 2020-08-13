package oopsAndInheritance;

import java.util.Scanner;

public class StringAndStringBuffer9 
{
	public static void main(String[] args) 
	{
		/*
		 * Return a version of the given string, 
		 * where for every star (*) in the string the star 
		 * and the chars immediately to its left and right 
		 * are gone. So "ab*cd" yields "ad" and "ab**cd" 
		 * also yields "ad".
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string :");
		String sb = sc.next();
		StringBuffer ans = new StringBuffer();
		for(int i=0; i< sb.length();i++)
		{
			if(sb.charAt(i) == '*')
			{
				if(ans.length() != 0 && sb.charAt(i-1) == ans.charAt(ans.length()-1))
					ans.deleteCharAt(ans.length()-1);
				do
				{
					i++;
				}while(sb.charAt(i)=='*');
			}
			else
				ans.append(sb.charAt(i));				
		}
		System.out.println(ans);
		sc.close();
	}
}
