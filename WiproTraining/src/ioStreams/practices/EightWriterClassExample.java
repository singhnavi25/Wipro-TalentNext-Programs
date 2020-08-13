package ioStreams.practices;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class EightWriterClassExample 
{
	public static void main(String[] args) throws IOException 
	{
		Writer w = new FileWriter("src\\ioStreams\\practices\\EightWriterClassExample.txt");
		String content = "I love my country\nBy Manjot Singh";  
        w.write(content);  
        w.close();  
        System.out.println("Done");  
	}
}
