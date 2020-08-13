package in.manjot.threadControlAndPriorities;

public class Assignment2 implements Runnable
{
	/*
	 * Create two threads, one thread to display all even numbers between 1 & 20, 
	 * another to display odd numbers between 1 & 20.
	 * Note: Display all even numbers followed by odd numbers
	 * Hint: use join
	 */
	
	static Thread first;
	static Thread second;

	public static void main(String[] args) 
	{
		Assignment2 as = new Assignment2();
		first = new Thread(as, "odd");
		second = new Thread(as, "even");
		
		first.start();
		second.start();
		System.out.println("End");
	}
	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		if(Thread.currentThread().getName().equals("odd"))
		{
			try 
			{
				second.join();
			} 
			catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for(int i=1; i<=20; i++)
		{
			if(Thread.currentThread().getName().equals("even") && i%2==0)
				System.out.println(i);
			if(Thread.currentThread().getName().equals("odd") && i%2==1)
				System.out.println(i);
		}
	}

}
