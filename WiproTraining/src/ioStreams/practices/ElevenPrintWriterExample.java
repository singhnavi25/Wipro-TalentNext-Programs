package ioStreams.practices;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ElevenPrintWriterExample 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		// Data to write on Console using PrintWriter
		PrintWriter writer = new PrintWriter(System.out);
		writer.write("Hello Manjot Singh");
		writer.flush();
		writer.close();

		// Data to write in File using PrintWriter
		PrintWriter writer1 = null;
		writer1 = new PrintWriter(new File("src\\ioStreams\\practices\\ElevenPrintStreamExample.txt"));
		writer1.write("Like Java, Spring, Hibernate, Android, PHP etc.");
		writer1.flush();
		writer1.close();
	}
}
