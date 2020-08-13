package ioStreams.practices;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class SecondBufferedInputStream 
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis = new FileInputStream("src\\ioStreams\\practices\\SecondBufferesOutputStream.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		int i;
		while((i=bis.read())!=-1)
			System.out.print((char)i);
		
		bis.close();
		System.out.println();
		fis.close();
	}
}
