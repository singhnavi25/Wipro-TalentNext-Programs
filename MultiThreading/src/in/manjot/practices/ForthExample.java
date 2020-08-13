package in.manjot.practices;

public class ForthExample implements Runnable
{

	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		for(int i=1; i<=100; i++)
			System.out.println(Thread.currentThread().getName() + " thread is running --- > " + i);
	}
	public static void main(String[] args) 
	{
		ForthExample forthExample = new ForthExample();
		Thread t1 = new Thread(forthExample, "First");
		Thread t2 = new Thread(forthExample, "Second");
//		t1.start();
//		t2.start();
		t1.run();
		t2.run();
//		forthExample.run();
	}	
}
