package ioStreams.practices;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ForthByteArrayOutputStream
{
	public static void main(String[] args) throws IOException 
	{
		FileOutputStream fos1 = new FileOutputStream("src\\ioStreams\\practices\\FirstFileOutputStream.txt", true);
		FileOutputStream fos2 = new FileOutputStream("src\\ioStreams\\practices\\SecondBufferesOutputStream.txt", true);
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		baos.write(98); // appending b in file
		baos.writeTo(fos1);
		baos.writeTo(fos2);
		baos.flush();
		baos.close();
		fos1.close();
		fos2.close();
		System.out.println("Finish");
	}
}
