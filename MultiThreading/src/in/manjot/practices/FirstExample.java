package in.manjot.practices;

public class FirstExample extends Thread
{
	public void run()
	{
		for(int i=1; i<=100; i++)
			System.out.println("Thread is running..." + i);
	}
	public static void main(String[] args) 
	{
		FirstExample t = new FirstExample();
		t.start();
	}
}
