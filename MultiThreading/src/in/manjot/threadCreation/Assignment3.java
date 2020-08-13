package in.manjot.threadCreation;

public class Assignment3 extends Thread
{
	/*
	 * 1. Create class of SalesPersons as a thread that will display fives sales persons name.
	 * 2. Create a class as Days as other Thread that has array of seven days.
	 * 3. Call the instance of SalesPersons in Days and start both the threads
	 * 4. suspend SalesPersons on Sunday and resume on wednesday 
	 * Note: use suspend, resume methods from thread
	 */
	public static void main(String[] args) 
	{				
		Days days = new Days();
		Thread t1 = new Thread(days);
		t1.start();		
	}
}
