package in.manjot.practices;

public class SixPrioritySsetExample implements Runnable
{

	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		for(int i=1; i<=100; i++)
			System.out.println(Thread.currentThread().getName() + " thread is running..." + i);
	}
	public static void main(String[] args) 
	{
		SixPrioritySsetExample obj = new SixPrioritySsetExample();
		Thread t1 = new Thread(obj, "First");
		Thread t2 = new Thread(obj, "Second");
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);
		t1.setPriority(1);
		t2.setPriority(10);
		t1.start();
		t2.start();
	}
}
