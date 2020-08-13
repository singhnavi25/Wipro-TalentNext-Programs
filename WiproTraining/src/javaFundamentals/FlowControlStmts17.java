package javaFundamentals;

public class FlowControlStmts17 
{
	public static void main(String[] args)
	{
		// check passed cmd arg is palindrome or not
		boolean flag = true;
		int j = args[0].length()-1;
		int i = 0;
		while(i < j)
		{
			if(args[0].charAt(i++) != args[0].charAt(j--))
			{
				flag = false;
				break;
			}
		}
		if(flag)
			System.out.println(args[0] + " is palindrome");
		else
			System.out.println(args[0] + " is not palindrome");
	}
}
