package ioStreams.practices;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FifthDataInputStream 
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis = new FileInputStream("src\\ioStreams\\practices\\FifthDataOutputStream.txt");
		DataInputStream dis = new DataInputStream(fis);
		
		int count = dis.available();  
	    byte[] ary = new byte[count];  
	    dis.read(ary);  
	    for(byte bt : ary) 
	    {  
	    	char k = (char) bt;  
		    System.out.print(k+"-");  
	    } 
	    System.out.println();
	    dis.read(ary);  
	    for(byte bt : ary) 
	    {  
	    	int k = (int) bt;  
		    System.out.print(k+"-");  
	    }  
	    dis.close();
	    fis.close();
	}
}
