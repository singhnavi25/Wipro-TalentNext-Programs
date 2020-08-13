package ioStreams.practices;

import java.io.FileWriter;
import java.io.IOException;

public class NineFileWriterExample 
{
	public static void main(String[] args) throws IOException 
	{
		FileWriter fw=new FileWriter("src\\ioStreams\\practices\\NineFileWriterExample.txt");    
        fw.write("Welcome to javaTpoint.\n");  
        fw.write("Manjot Singh");
        fw.close(); 
        System.out.println("Done");
	}
}
