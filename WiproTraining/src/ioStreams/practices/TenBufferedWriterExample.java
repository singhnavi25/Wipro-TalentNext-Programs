package ioStreams.practices;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TenBufferedWriterExample 
{
	public static void main(String[] args) throws IOException 
	{
		FileWriter writer = new FileWriter("src\\ioStreams\\practices\\TenBufferedWriterExample.txt");  
	    BufferedWriter buffer = new BufferedWriter(writer);  
	    buffer.write("Welcome to javaTpoint.");  
	    buffer.newLine();
	    buffer.write("Manjot Singh Hello");
	    buffer.close();  
	    System.out.println("Success...");
	}
}
