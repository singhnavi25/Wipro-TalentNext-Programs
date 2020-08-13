package javaFundamentals;


public class FlowControlStmts13 
{
	public static void main(String[] args)
	{
		// print prime number b/w 10 and 99
		for(int number = 10; number <= 99; number++)
		{
			boolean flag = true;
			if(number != 2 && number != 3)
				for(int i = 2; i<=(int)Math.sqrt(number) ;i++)
					if(number%i==0)
						flag = false;
			if(flag)
				System.out.print(number + " ");
		}
	}
}
