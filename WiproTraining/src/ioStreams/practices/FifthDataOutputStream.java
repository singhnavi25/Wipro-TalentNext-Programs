package ioStreams.practices;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FifthDataOutputStream 
{
	public static void main(String[] args) throws IOException 
	{
		FileOutputStream fos = new FileOutputStream("src\\ioStreams\\practices\\FifthDataOutputStream.txt", false);
		
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeInt(65);// writing as int same for writeByte and writeLong and etc.
		dos.writeBytes("Manjot Singh");
		dos.flush();
		dos.close();
		fos.close();
		System.out.println("Finish");
	}
}
