package javaFundamentals;

public class FlowControlStmts6 
{
	public static void main(String[] args)
	{
		int age = Integer.parseInt(args[1]);
		if(args[0].equals("Male"))
		{
			if(age >= 1 && age <= 60)
				System.out.println("Interest = 9.2%");
			else if(age >=61 && age<=120)
				System.out.println("Interest = 8.3%");
		}
		else
		{
			if(age>=1 && age <= 58)
				System.out.println("Interest = 8.2%");
			else if(age >= 59 && age <= 120)
				System.out.println("Interest = 7.6%");
		}
		
	}
}
