package ioStreams;

import java.util.Properties;

public class SystemProperties 
{
	public static void main(String[] args) 
	{
//		Properties p = System.getProperties();
//		p.list(System.out);
		
//		String s = System.getProperty("user.name");
//		System.out.println(s);
		
		Properties p = System.getProperties();
		p.put("user.name", "ASUS"); // I choose same name user name we can define our own name in space of ASUS
		System.setProperties(p);
		System.out.println(System.getProperty("user.name"));
	}
}
