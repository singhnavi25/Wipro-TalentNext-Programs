package ioStreams.practices;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class ThirdSequenceInputStream 
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis1 = new FileInputStream("src\\ioStreams\\practices\\FirstFileOutputStream.txt");
		FileInputStream fis2 = new FileInputStream("src\\ioStreams\\practices\\SecondBufferesOutputStream.txt");
		
		SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
		int i;
		while((i=sis.read())!=-1)
			System.out.print((char)i);
		
		sis.close();
		System.out.println();
		fis1.close();
		fis2.close();
	}
}
