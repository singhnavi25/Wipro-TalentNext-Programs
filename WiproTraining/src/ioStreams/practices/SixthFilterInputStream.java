package ioStreams.practices;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

public class SixthFilterInputStream 
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis = new FileInputStream("src\\ioStreams\\practices\\SixthFilterOutputStream.txt");
		FilterInputStream flis = new BufferedInputStream(fis);
		int k =0;  
        while((k=flis.read())!=-1)
        {  
            System.out.print((char)k);  
        }  
        flis.close();  
        fis.close();  
	}
}
