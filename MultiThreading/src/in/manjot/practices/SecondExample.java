package in.manjot.practices;

public class SecondExample 
{
	public static void main(String[] args) 
	{
		Thread t = Thread.currentThread();
		System.out.println("Current thread :" + t);
		t.setName("Navi");
		System.out.println("New name of the thread is :" + t);
		try
		{
			Thread.sleep(1000);
		} 
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
