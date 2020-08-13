package abstractionPackagesExceptionHandling;

import java.util.Scanner;

public class ExceptionHandling1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer :");
		String str = sc.next();
		
		try
		{
			int integerValue= Integer.parseInt(str);
			System.out.println("The square value is " + (integerValue*integerValue));
			System.out.println("The work has been done successfully.");
		}
		catch (NumberFormatException e) 
		{
			// TODO: handle exception
			System.out.println("Entered input is not a valid format for an integer.");
		}
		sc.close();
	}
}
