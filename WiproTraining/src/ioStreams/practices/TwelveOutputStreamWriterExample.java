package ioStreams.practices;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TwelveOutputStreamWriterExample 
{
	public static void main(String[] args) throws IOException 
	{
		OutputStream os = new FileOutputStream("src\\ioStreams\\practices\\TwelveOutputStreamWriterExample.txt");
		Writer wr = new OutputStreamWriter(os);
		wr.write("Hello Manjot Singh.\nHow are you?");
		wr.flush();
		wr.close();
		os.close();
		System.out.println("Done");
	}
}
