package ioStreams.practices;

import java.io.FileInputStream;
import java.io.IOException;

public class FirstFileInputStream 
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis = new FileInputStream("src\\ioStreams\\practices\\FirstFileOutputStream.txt");
		int i = fis.read();// reading one byte
		System.out.println((char)i);
		
		while((i = fis.read()) != -1)
			System.out.print((char)i); // reading charachter of stream
		
		fis.close();
	}
}
