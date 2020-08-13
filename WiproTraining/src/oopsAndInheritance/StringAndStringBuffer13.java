package oopsAndInheritance;

import java.util.Scanner;

public class StringAndStringBuffer13 
{
	public static String Word(String m, String f)
	{
		int x = m.length();
		int y = f.length();
		String ans = "";
		for (int i = 0; i < x-y+1; i++) 
		{
			String tmp = m.substring(i,i+y);
		    if (i > 0 && tmp.equals(f))
		    	ans += m.substring(i-1,i);
		    if (i < x-y && tmp.equals(f))
		    	ans += m.substring(i+y,i+y+1);
		}
		return ans;
	}
	public static void main(String[] args) 
	{
		/*
		 * Given a string and a non-empty word string, 
		 * return a string made of each char just before 
		 * and just after every appearance of the word in 
		 * the string. Ignore cases where there is no char 
		 * before or after the word, and a char may be 
		 * included twice if it is between two words.
		 * If inputs are "abcXY123XYijk" and "XY", 
		 * output should be "c13i".
		 * If inputs are "XY123XY" and "XY", output should be "13".
		 * If inputs are "XY1XY" and "XY", output should be "11".
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string major and finder string :");
		System.out.println(Word(sc.next(), sc.next()));
		sc.close();
	}
}
