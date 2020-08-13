package project.haraAndTortoiseRace;

public class RaceTrack implements Runnable
{
	static Hare hare = null;
	static Tortoise tortoise = null;
	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		while (true) 
		{
			if (!hare.isAlive() && tortoise.isAlive())
			{
				tortoise.stop();
				System.out.println("Hare won the race...");
				break;
			}
			if (!tortoise.isAlive() && hare.isAlive()) 
			{
				hare.stop();
				System.out.println("Tortoise won the race...");
				break;
			}
		}
		
	}
	public static void main(String[] args) 
	{
		tortoise = new Tortoise();
		hare = new Hare();
		
		hare.setName("Hare");
		tortoise.setName("Tortoise");
		
		hare.setPriority(Thread.MAX_PRIORITY);
		tortoise.setPriority(Thread.MIN_PRIORITY);
		
		Thread t = new Thread(new RaceTrack());
		
		hare.start();
		tortoise.start();
		t.start();
	}
}
