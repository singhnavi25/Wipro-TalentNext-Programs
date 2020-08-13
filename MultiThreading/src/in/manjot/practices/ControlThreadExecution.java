package in.manjot.practices;

public class ControlThreadExecution
{
	public static void main(String[] args) 
	{
		Controler t1 = new Controler("One");
		Controler t2 = new Controler("Two");
		Controler t3 = new Controler("Three");
		
		System.out.println("Thread One is alive :" + t1.thread.isAlive());
		System.out.println("Thread Two is alive :" + t2.thread.isAlive());
		System.out.println("Thread Three is alive :" + t3.thread.isAlive());
		
		try
		{
			System.out.println("Waiting for child threads to finish");
			t1.thread.join();
			t2.thread.join();
			t3.thread.join();
		}
		catch (InterruptedException e) 
		{
			// TODO: handle exception
			System.out.println("Main thread interrupted");
		}
		
		System.out.println("Thread One is alive :" + t1.thread.isAlive());
		System.out.println("Thread Two is alive :" + t2.thread.isAlive());
		System.out.println("Thread Three is alive :" + t3.thread.isAlive());
	}
}
class Controler implements Runnable
{
	String name;
	Thread thread;
	
	public Controler(String name) 
	{
		super();
		this.name = name;
		this.thread = new Thread(this, this.name);
		System.out.println("New Thread: " + thread);
		thread.start();
	}

	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		for(int i=5; i>0; i--)
		{
			System.out.println("Child Thread: " + i);
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				System.out.println(this.name + " Interrupted");
			}
		}
		System.out.println(this.name + " Exiting");
	}
	
}
