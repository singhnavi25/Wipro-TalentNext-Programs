package in.manjot.threadCreation;

public class Assignment1 implements Runnable
{
	/*
	 * Create two threads and assign names ‘Scooby’ and ‘Shaggy’ to the two threads. 
	 * Display both thread names
	 */
	@Override
	public void run()
	{
		System.out.println("Thread :" + Thread.currentThread().getName());
	}
	public static void main(String[] args) 
	{
		Assignment1 as = new Assignment1();
		Thread t1 = new Thread(as, "Scooby");
		Thread t2 = new Thread(as, "Shaggy");
		t1.start();
		t2.start();
	}
}
