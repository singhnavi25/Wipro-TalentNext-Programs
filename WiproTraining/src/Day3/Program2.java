package Day3;

import java.util.Scanner;

public class Program2 
{
	static int isOdd(int n)
	{
		return n%2 == 1 ? 2 : 1;
	}
	public static void main(String[] args)
	{
		// check odd
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any value :");
		int n = sc.nextInt();
		System.out.println(isOdd(n));
		sc.close();
	}
}
