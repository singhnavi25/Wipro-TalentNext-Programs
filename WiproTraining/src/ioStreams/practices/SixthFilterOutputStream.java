package ioStreams.practices;

import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class SixthFilterOutputStream 
{
	public static void main(String[] args) throws IOException 
	{
		FileOutputStream fos = new FileOutputStream("src\\ioStreams\\practices\\SixthFilterOutputStream.txt");
		FilterOutputStream flos = new FilterOutputStream(fos);
		flos.write(65); // writing byte into file
		String s = "Hello Manjot Singh\nSixthFilterOutputStream example";
		byte[] b = s.getBytes();
		flos.write(b); // Writing a string as array of bytes
		flos.flush();
		flos.close();
		fos.close();
		System.out.println("Finish");
	}
}
