package ioStreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class IOOperations2 
{
	/*
	 *  File Copy
	 *  Write a program to copy from one file to another.
	 *  Sample Input and Output:
	 *  Enter the input file name
	 *  Input.txt
	 *  Enter the output file name
	 *  Output.txt
	 */
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input file name"); // Enter file name as Input.txt otherwise it gives File not found exception
		String inputFileName = sc.nextLine();
		System.out.println("Enter the output file name");
		String outputFileName = sc.nextLine();
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try
		{
			File inputfile =new File("src\\ioStreams\\"+inputFileName);
    	    File outputfile =new File("src\\ioStreams\\"+outputFileName);
    	    
    	    fis = new FileInputStream(inputfile);
    	    fos = new FileOutputStream(outputfile);
    	    
    	    int b; 
            while  ((b=fis.read()) != -1) 
                fos.write(b); 
		}
		catch(IOException e)
		{
    		e.printStackTrace();
    	}
		finally 
		{
			try
			{
				if(fos!=null)
					fos.close();
			}
			catch(IOException r)
			{
				System.out.println("File not found");
			}
			try
			{
				if(fis!=null)
					fis.close();
			}
			catch(IOException r)
			{
				System.out.println("File not found");
			}
			sc.close();
			System.out.println("Done");
		}
	}
}
