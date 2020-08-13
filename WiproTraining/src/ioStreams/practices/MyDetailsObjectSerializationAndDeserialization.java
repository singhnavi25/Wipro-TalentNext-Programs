package ioStreams.practices;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MyDetailsObjectSerializationAndDeserialization 
{
	public static void main(String[] args) 
	{
		// Serialization of object
		try
		{
			MyDetails md = new MyDetails();
			md.setName("Manjot Singh");
			md.setId(1001);
			md.setSalary(103020);
			FileOutputStream fout = new FileOutputStream("serial"); // file where we want to store and any kind extension
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			oos.writeObject(md);
			oos.flush();
			oos.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception during serialization :" +e);
			System.exit(0);
		}
		// Deserialization of object
		try
		{
			MyDetails md1;
			FileInputStream fis = new FileInputStream("serial");
			ObjectInputStream ois = new ObjectInputStream(fis);
			md1 = (MyDetails)ois.readObject();
			ois.close();
			fis.close();
			System.out.println(md1);
		}
		catch(Exception e)
		{
			System.out.println("Exception during deserialization :" +e);
			System.exit(0);
		}
	}
}
