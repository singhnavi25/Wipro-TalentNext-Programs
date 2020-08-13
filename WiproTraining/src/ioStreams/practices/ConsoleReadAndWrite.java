package ioStreams.practices;

import java.io.Console;
import java.io.IOException;

public class ConsoleReadAndWrite 
{
	public static void main(String[] args) throws IOException
	{
		Console c = System.console();
//		System.out.print("Enter any string :");
//		String str = c.readLine();
//		System.out.println("You have entered :" + str);
		
		System.out.println("Enter password: ");    
		char[] ch = c.readPassword();    
		String pass=String.valueOf(ch);//converting char array into string    
		System.out.println("Password is: "+pass); 
	}
}
