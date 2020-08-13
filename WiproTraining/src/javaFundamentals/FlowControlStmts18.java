package javaFundamentals;

public class FlowControlStmts18 
{
	public static void main(String[] args)
	{
		// program to print first 5 digits divisible by 2, 3, 5
		int i = 1;
		int count = 0;
		while(count != 5)
		{
			if(i%2 == 0 && i%3 == 0 && i%5 == 0)
			{
				System.out.println(i);
				count++;
			}
			i++;
		}
	}
}
