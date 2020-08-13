package Day3;

import java.util.Scanner;

public class Program1 
{
	static int isEven(int n)
	{
		return n%2 == 0 ? 2 : 1;
	}
	public static void main(String[] args)
	{
		// check even
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any value :");
		int n = sc.nextInt();
		System.out.println(isEven(n));
		sc.close();
	}
}
