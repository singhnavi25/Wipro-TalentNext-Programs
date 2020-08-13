package ioStreams.practices;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TenBufferedReaderExample 
{
	public static void main(String[] args) throws IOException 
	{
//		FileReader fr=new FileReader("src\\ioStreams\\practices\\TenBufferedWriterExample.txt");    
//        BufferedReader br=new BufferedReader(fr);    
//
//        String i;    
//        while((i=br.readLine())!=null) // read line by line
//        {  
//        	System.out.println(i);  
//        }  
//        br.close();
//        fr.close();
//        
//        fr=new FileReader("src\\ioStreams\\practices\\TenBufferedWriterExample.txt");
//        br=new BufferedReader(fr);    
//        System.out.println();
//        int b;    
//        while((b=br.read())!=-1) // reading char by char
//        {  
//        	System.out.print((char)b);  
//        }  
//        br.close();    
//        fr.close();  
		
		
		// Reading data from console
//		InputStreamReader r=new InputStreamReader(System.in);    
//	    BufferedReader br=new BufferedReader(r);            
//	    System.out.println("Enter your name");    
//	    String name=br.readLine();    
//	    System.out.println("Welcome "+name); 
		
//		Another example of reading data from console until user writes 'stop'
		InputStreamReader r=new InputStreamReader(System.in);    
	    BufferedReader br=new BufferedReader(r);           
	    String name="";    
	    while(!name.equals("stop"))
	    {    
	    	System.out.println("Enter data: ");    
		    name=br.readLine();    
		    System.out.println("data is: "+name);    
	    }              
	    br.close();    
	    r.close();    
	}
}
