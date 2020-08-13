package ioStreams.practices;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class ElevenPrintStreamExample 
{
	public static void main(String[] args) throws IOException 
	{
		FileOutputStream fos = new FileOutputStream("src\\ioStreams\\practices\\ElevenPrintStreamExample.txt");
		PrintStream ps = new PrintStream(fos); // its meyhods don't throw IOException
		ps.print(2000);
		ps.println("is my birth Year");
		ps.println("My name is Manjot Singh");
		ps.close();
		fos.close();
		System.out.println("Done");
	}
}
