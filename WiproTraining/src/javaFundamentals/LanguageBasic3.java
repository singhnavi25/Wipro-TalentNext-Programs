package javaFundamentals;

public class LanguageBasic3 
{
	public static void main(String[] args)
	{
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int sum = x + y;
		System.out.print("The sum of " + args[0] + " and " + args[1] + " is " + sum);
	}
}
