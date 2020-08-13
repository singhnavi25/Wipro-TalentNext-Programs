package in.manjot.threadCreation;

public class SalesPersons extends Thread
{
	String[] salesPersonsName = {"Manjot Singh", "Noor", "Manu", "Komal", "Harsh"};

	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		for(String name: salesPersonsName)
		{
			System.out.println(name);
			try 
			{
				sleep(2000);
			} 
			catch (InterruptedException e1) 
			{
				e1.printStackTrace();
			}
		}
	}
}
