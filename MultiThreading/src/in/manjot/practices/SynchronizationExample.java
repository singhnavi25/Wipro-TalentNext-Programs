package in.manjot.practices;

class Account
{
	int balance;
	public Account()
	{
		balance = 5000;
	}
	public synchronized void withdraw(int bal)
	{
		try 
		{
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		balance = balance - bal;
		System.out.println("Remaining balance is : " + balance);
	}
	
//	public void withdraw(int bal)
//	{
//		try 
//		{
//			Thread.sleep(1000);
//		} 
//		catch (InterruptedException e) 
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		balance = balance - bal;
//		System.out.println("Remaining balance is : " + balance);
//	}
}
public class SynchronizationExample implements Runnable
{

	Account obj;
	public SynchronizationExample(Account obj) 
	{
		// TODO Auto-generated constructor stub
		this.obj = obj;
	}
	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		obj.withdraw(500);
		
	}
	
	public static void main(String[] args) 
	{
		Account ac = new Account();
		SynchronizationExample x = new SynchronizationExample(ac);
		Thread t1 = new Thread(x);
		Thread t2 = new Thread(x);
	
		t1.start();
		t2.start();
	}
}
