package ioStreams.practices;

import java.io.FileReader;
import java.io.IOException;

public class NineFileReaderExample 
{
	public static void main(String[] args) throws IOException 
	{	
		FileReader fr = new FileReader("src\\ioStreams\\practices\\NineFileWriterExample.txt");    
        int i;    
        while((i=fr.read())!=-1)    
        	System.out.print((char)i);    
        fr.close();    
	}
}
