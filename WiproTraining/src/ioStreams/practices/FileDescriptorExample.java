package ioStreams.practices;

import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDescriptorExample 
{
	public static void main(String[] args) throws IOException 
	{  
        byte[] b = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58 }; 
        FileOutputStream fos = new FileOutputStream("src\\ioStreams\\practices\\FileDescriptorExample.txt");  
        FileInputStream fis = new FileInputStream("src\\ioStreams\\practices\\FileDescriptorExample.txt"); 
        
        FileDescriptor fd = fos.getFD();  
        fos.write(b);  
        fos.flush();  
        fd.sync();// confirms data to be written to the disk  
        fos.close();
        
        int value = 0;  
        // for every available bytes  
        while ((value = fis.read()) != -1) 
        {  
            char c = (char) value;// converts bytes to char  
            System.out.print(c);  
        }  
        fis.close();
        System.out.println("\nSync() successfully executed!!");  
	}
}
