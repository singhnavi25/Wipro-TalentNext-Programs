package ioStreams.practices;

import java.io.Console;

public class ConsoleReadAndWriteClass 
{
	public static void main(String[] args) 
	{
		Console console = System.console();
        if (console == null) 
        {
            System.out.println("Unable to fetch console");
            return;
        }
        String line = console.readLine();
        console.printf("I saw this line: %s", line);
        System.out.println("Enter password: ");    
        char[] ch = console.readPassword();    
        String pass=String.valueOf(ch);//converting char array into string    
        System.out.println("Password is: "+pass);    
	}
}
