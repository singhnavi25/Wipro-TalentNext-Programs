package javaFundamentals;
import java.util.Scanner;
public class FlowControlStmts5 
{
	public static void main(String[] args)
	{
		// program to check entered char is alphabet, digit or special char
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a char :");
		char ch = sc.next().charAt(0);
		if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
			System.out.println("Alphabet");
		else if(ch >= '0' && ch <= '9')
			System.out.println("Digit");
		else
			System.out.println("Special Character");
		sc.close();
	}
}
