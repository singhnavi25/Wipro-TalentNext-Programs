package project.haraAndTortoiseRace;

public class Hare extends Thread
{

	public void run() 
	{
		// TODO Auto-generated method stub
		for(int i=1; i<=100; i++)
		{
			System.out.println(Thread.currentThread().getName() + " reach at : " + i + "m");
			if(i==60)
			{
				try 
				{
					sleep(1000);
				} 
				catch (InterruptedException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
