package in.manjot.threadControlAndPriorities;

public class Assignment3 implements Runnable
{

	/*
	 * Create three threads- with different priorities – MAX, MIN, NORM- and 
	 * start the threads at the same time. 
	 * Observe the completion of the threads.
	 */
	public static void main(String[] args) 
	{
		Assignment3 as = new Assignment3();
		Thread t1 = new Thread(as, "First");
		Thread t2 = new Thread(as, "Second");
		Thread t3 = new Thread(as, "Third");
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
	}
	
	static int i;
	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		for(i=1; i<=100; i++)
			System.out.println(Thread.currentThread().getName() + " thread is running ---> " + i);
	}

}
