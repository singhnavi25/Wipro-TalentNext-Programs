package junitTests;

import java.util.Arrays;

public class MyUnit 
{
	public String stringConcat(String first, String second)
	{
		return first+second;
	}
	public int[] sortValues(int[] arr)
	{
		Arrays.sort(arr);
		return arr;
	}
	public boolean checkPresence(String str, String has)
	{
		return str.contains(has);
	}
}
