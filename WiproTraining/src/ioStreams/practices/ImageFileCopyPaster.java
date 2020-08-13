package ioStreams.practices;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageFileCopyPaster 
{
	public static void main(String[] args) throws IOException
	{
		
		//Image file copy from one directory to another
//		FileInputStream fin = new FileInputStream("D:\\sardar\\Pics\\wallpaper\\cubes_red_black_131950_1920x1080.jpg"); // My pc file
//		FileOutputStream fout = new FileOutputStream("src\\ioStreams\\practices\\copy.jpg");
//		int i;
//		do
//		{
//			i = fin.read();
//			if(i!=-1)
//				fout.write(i);
//		}while(i!=-1);
//		fin.close();
//		fout.close();
		
		
		// Copying song file
		FileInputStream fin = new FileInputStream("D:\\sardar\\Punjabi songs\\chamkila\\Desi Daroo Vargi- Amar Singh Chamkila.mp3");
		FileOutputStream fout = new FileOutputStream("src\\ioStreams\\practices\\Desi Daroo Vargi- Amar Singh Chamkila.mp3");
		int i;
		do
		{
			i = fin.read();
			if(i!=-1)
				fout.write(i);
		}while(i!=-1);
		fin.close();
		fout.close();
		System.out.println("Finish");
	}
}
