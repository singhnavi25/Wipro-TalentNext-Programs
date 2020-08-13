package in.manjot.threadCreation;

import java.util.Random;

public class Assignment2 implements Runnable
{
	/*
	 * store colours in the form of an array
	 * ex: String colours[]={"white","blue","black","green","red","yellow"};
	 * display all colours repeatedly by generating colour index from Random class. 
	 * If the random colour index matches to red stop display.
	 * Note: perform this task by implementing Runnabe interface
	 */
	
	String[] colours={"white", "blue", "black", "green", "red", "yellow"};
	@Override
	public void run()
	{
		Random rand = new Random();
		int i;
		while(!colours[i=rand.nextInt(6)].equals("red"))
		{
			System.out.println(colours[i]);
		}
	}
	public static void main(String[] args) 
	{
		Assignment2 as = new Assignment2();
		Thread t1 = new Thread(as, "Scooby");
//		Thread t2 = new Thread(as, "Shaggy");
		t1.start();
//		t2.start();
	}
}
