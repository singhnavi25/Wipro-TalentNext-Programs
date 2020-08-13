package ioStreams.practices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadingCharacters
{
	public static void main(String[] args) throws IOException
	{
		// Reading characters
		char ch;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter characters, 'q' for quit.");
		do
		{
			ch = (char)br.read();
			System.out.print(ch);
		}while(ch!='q');
		
		//Reading string means whole line in one time
		br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter another example.");
		System.out.println("Enter Characters, ‘stop’ to quit");
		String str;
		do 
		{
			str = br.readLine( );//  reading whole line and if stop is single line than it terminates
			System.out.println(str);
		}while (!str.equals("stop"));
		
	}
}
