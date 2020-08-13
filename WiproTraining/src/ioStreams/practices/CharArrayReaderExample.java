package ioStreams.practices;

import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReaderExample 
{
	public static void main(String[] args) throws IOException 
	{
		char[] ary = { 'j', 'a', 'v', 'a', 't', 'p', 'o', 'i', 'n', 't' };  
	    CharArrayReader reader = new CharArrayReader(ary);  
	    int k = 0;  
	    // Read until the end of a file  
	    while ((k = reader.read()) != -1) 
	    {  
	    	char ch = (char) k;  
		    System.out.print(ch + " : ");  
		    System.out.println(k);
	    }
	}
}
