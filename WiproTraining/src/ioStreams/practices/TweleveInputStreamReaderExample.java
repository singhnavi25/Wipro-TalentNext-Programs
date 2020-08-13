package ioStreams.practices;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TweleveInputStreamReaderExample 
{
	public static void main(String[] args) throws IOException 
	{
		InputStream is = new FileInputStream("src\\ioStreams\\practices\\TwelveOutputStreamWriterExample.txt");
		InputStreamReader isr = new InputStreamReader(is);
		int i;
		while((i=isr.read())!=-1)
			System.out.print((char)i);
		
		isr.close();
		is.close();
	}
}
