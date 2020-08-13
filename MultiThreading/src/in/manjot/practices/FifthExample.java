package in.manjot.practices;

public class FifthExample 
{
	public static void main(String[] args) 
	{
		Thread t = new Thread() {
			//@Override
			public void run() 
			{
				for(int i=1; i<=100; i++)
					System.out.println("Thrad is running..." + i);
			}
		};
		t.start();
	}
}
