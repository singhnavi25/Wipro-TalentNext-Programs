package in.manjot.threadCreation;

public class Days extends Thread
{
	String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
//	@SuppressWarnings("deprecation")
	@Override
	public void run() 
	{
		SalesPersons salesPersons = new SalesPersons();
		salesPersons.start();
		for (String day : days) 
		{
			System.out.println(day);
			if (day.equals("Sunday")) 
			{
				System.out.println("Sales class suspended------");
				salesPersons.suspend();
			} 
			
			if (day.equals("Wednesday")) 
			{
				System.out.println("Sales class resumed...");
				salesPersons.resume();
			}
			try 
			{
				sleep(2000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
