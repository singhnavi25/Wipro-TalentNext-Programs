package ioStreams.practices;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class EightReaderClassExample 
{
	public static void main(String[] args) throws IOException 
	{
		Reader reader = new FileReader("src\\ioStreams\\practices\\EightWriterClassExample.txt");  
        int data = reader.read();  
        while (data != -1) 
        {  
            System.out.print((char) data);  
            data = reader.read();  
        }  
        reader.close();  
	}
}
