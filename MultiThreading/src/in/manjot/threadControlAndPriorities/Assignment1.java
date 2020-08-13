package in.manjot.threadControlAndPriorities;

public class Assignment1 implements Runnable
{
	/*
	 * Create a thread which prints 1 to 10. 
	 * After printing 5, there should be a delay of 5000 milliseconds before printing 6
	 */
	
	public static void main(String[] args) 
	{
		Assignment1 as = new Assignment1();
		Thread t = new Thread(as, "First");
		t.start();
	}
	
	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		for(int i=1; i<=10; i++)
		{
			if(i==6)
			{
				try 
				{
					Thread.sleep(5000);
				} 
				catch (InterruptedException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(i);
		}
	}
	
}
