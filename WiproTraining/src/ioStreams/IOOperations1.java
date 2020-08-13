package ioStreams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class IOOperations1 
{

	/*
	 * File : Count Character
	 * Write a program to count the number of times a character appears in 
	 * the File. (Case insensitive... 'a' and 'A' are considered to be the same)
	 * Sample Output:
	 * Enter the file name
	 * Input.txt
	 * Enter the character to be counted
	 * r
	 * File 'Input.txt' has 99 instances of letter 'r'.
	 */
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name"); // Enter file name as Input.txt otherwise it gives File not found exception
		String fileName = sc.nextLine();
		System.out.println("Enter the character to be counted");
		char want = Character.toLowerCase(sc.nextLine().charAt(0));
	
		BufferedReader br = null;
		try
		{
			File file = new File("src\\ioStreams\\"+fileName);
			System.out.println(file);
			br = new BufferedReader(new FileReader(file));
			int count = 0;
			int i;
			while((i = br.read())!=-1)
			{
				char ch = Character.toLowerCase((char)i);
				if(ch == want)
					count++;
			}
			System.out.println("File '" + fileName + "' has " + count + " instances of letter '" + want +"'");
		}
		catch(IOException e)
		{
    		e.printStackTrace();
    	}
		finally
		{
			try
			{
				if(br!=null)
					br.close();
			}
			catch(IOException r)
			{
				System.out.println("File not found");
			}
			sc.close();
		}
	}
}
