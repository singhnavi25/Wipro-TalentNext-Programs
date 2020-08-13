package ioStreams.practices;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class ThirdSequenceInputStreamUsingEnumeration 
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream fis1 = new FileInputStream("src\\ioStreams\\practices\\FirstFileOutputStream.txt");
		FileInputStream fis2 = new FileInputStream("src\\ioStreams\\practices\\SecondBufferesOutputStream.txt");
		
		Vector v=new Vector();    
		v.add(fis1);    
		v.add(fis2);
		
		//creating enumeration object by calling the elements method    
		Enumeration e=v.elements();      
		//passing the enumeration object in the constructor    
		SequenceInputStream sis = new SequenceInputStream(e); 
		
		int i;
		while((i=sis.read())!=-1)
			System.out.print((char)i);
		
		sis.close();
		System.out.println();
		fis1.close();
		fis2.close();
	}
}
