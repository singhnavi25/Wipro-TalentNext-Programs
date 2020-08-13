package ioStreams.practices;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SecondBufferedOutputStream 
{
	public static void main(String[] args) throws IOException 
	{
		FileOutputStream fos = new FileOutputStream("src\\ioStreams\\practices\\SecondBufferesOutputStream.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		String s = "Hello Manjot Singh\nSecondBufferedOutputStream example";
		byte[] b = s.getBytes();
		
		bos.write(b);
		bos.flush();
		bos.close();
		fos.close();
		System.out.println("Finish");
	}
}
