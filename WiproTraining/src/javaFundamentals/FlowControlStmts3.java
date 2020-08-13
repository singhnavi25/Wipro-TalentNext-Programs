package javaFundamentals;

public class FlowControlStmts3 
{
	public static void main(String[] args)
	{
		// passing cmd args and check their length and print them
		int n = args.length;
		if(n == 0)
			System.out.println("No values");
		else
		{
			for(int i=0;i<n;i++)
			{
				if(i == n-1)
					System.out.println(args[i]);
				else
					System.out.print(args[i] + ", ");
			}
		}
	}
}
