package ioStreams.practices;

import java.io.File;
import java.io.IOException;

public class FileClass1 
{
	public static void main(String[] args) throws IOException 
	{
//		File file = new File("src\\ioStreams\\practices\\FileClass1.txt");
//		if (file.createNewFile())  
//	    	System.out.println("New File is created!");  
//	    else
//	        System.out.println("File already exists.");
//		System.out.println(file);
//		
//		
//        // createing new canonical from file object  
//        File file2 = file.getCanonicalFile();  
//        // returns true if the file exists  
//        System.out.println(file2);  
//        boolean bool = file2.exists();  
//        // returns absolute pathname  
//        String path = file2.getAbsolutePath();  
//        System.out.println(bool);  
//        // if file exists  
//        if (bool)
//            System.out.print(path + " Exists? " + bool);  
//        
//        File f = new File("src\\ioStreams\\practices");  
//        String filenames[]=f.list();  
//        for(String filename:filenames)
//        	System.out.println(filename); 
//        
        
        File dir=new File("src");  
        File files[] = dir.listFiles();  
        for(File file:files)
        {  
            System.out.println(file.getName()+" Can Write: "+file.canWrite()+" Is Hidden: "+file.isHidden()+" Length: "+file.length()+" bytes");  
        }  
	}
}
