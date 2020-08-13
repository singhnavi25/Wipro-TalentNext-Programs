package ioStreams.practices;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharArrayWriterExample 
{
	public static void main(String[] args) throws IOException 
	{
		CharArrayWriter out=new CharArrayWriter();    
        out.write("Welcome to javaTpoint\nManjot Singh");    
        FileWriter f1=new FileWriter("src\\ioStreams\\practices\\CharArrayWriterExample1.txt");    
        FileWriter f2=new FileWriter("src\\ioStreams\\practices\\CharArrayWriterExample2.txt");    
        out.writeTo(f1);    
        out.writeTo(f2);     
        f1.close();    
        f2.close();     
        System.out.println("Success..."); 
	}
}
