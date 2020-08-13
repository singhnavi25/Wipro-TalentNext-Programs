package ioStreams.practices;

import java.io.FileOutputStream;
import java.io.IOException;

public class FirstFileOutputStream 
{
	public static void main(String[] args) throws IOException 
	{
		FileOutputStream fos = new FileOutputStream("src\\ioStreams\\practices\\FirstFileOutputStream.txt");
		fos.write(65); // writing byte into file
		String s = "Hello Manjot Singh\nFirstFileOutputStream example";
		byte[] b = s.getBytes();
		fos.write(b); // Writing a string as array of bytes
		fos.close();
		System.out.println("Finish");
	}
}
