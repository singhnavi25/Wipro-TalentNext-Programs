package project.haraAndTortoiseRace;

public class Tortoise extends Thread
{

	public void run() 
	{
		// TODO Auto-generated method stub
		for(int i=1; i<=100; i++)
			System.out.println(Thread.currentThread().getName() + " reach at : " + i + "m");
	}

}
