package Day3;

import java.util.Scanner;

public class Program3 
{
	static int lastDigit(int n)
	{
		int sign = n < 0 ? -1 : 1;
		n *= sign;
		if(n<10 && n >=0)
			return -1;
		return (n%10)*sign;
	}
	public static void main(String[] args)
	{
		// return last digit if number is single digit return -1
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any value :");
		int n = sc.nextInt();
		System.out.println(lastDigit(n));
		sc.close();
	}
}
