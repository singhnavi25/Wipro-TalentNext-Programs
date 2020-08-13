package in.manjot.practices;

public class ThirdExample implements Runnable
{

	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		for(int i=1; i<=100; i++)
			System.out.println("Thrad is running..." + i);
	}
	public static void main(String[] args) 
	{
		ThirdExample thirdExample = new ThirdExample();
		Thread t = new Thread(thirdExample);
		t.start();
	}
}
