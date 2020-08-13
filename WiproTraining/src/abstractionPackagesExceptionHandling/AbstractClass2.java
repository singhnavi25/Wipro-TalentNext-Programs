package abstractionPackagesExceptionHandling;

import java.util.Random;

abstract class Compartment 
{ 
	abstract public void Notice(); 
} 
class FirstClass extends Compartment 
{
	@Override
	public void Notice() 
	{
		// TODO Auto-generated method stub
		System.out.println("First class compartment");
	} 
} 
class Ladies extends Compartment 
{
	@Override
	public void Notice() 
	{
		// TODO Auto-generated method stub
		System.out.println("Compartment for ladies"); 
	} 
} 
class General extends Compartment 
{
	@Override
	public void Notice()
	{
		// TODO Auto-generated method stub
		System.out.println("General compartment"); 
	} 
} 
class Luggage extends Compartment 
{
	@Override
	public void Notice() 
	{
		// TODO Auto-generated method stub
		System.out.println("Compartment for luggages"); 
	} 
}
public class AbstractClass2 // I give TestCompartment as AbstractClass2 for easy to manage
{
	public static void main(String[] args) 
	{
		Compartment[] cmp = new Compartment[10];
		Random random = new Random();
		for(int i=0; i<10; i++)
		{
			int choice = random.nextInt(4);
			if(choice == 0)
				cmp[i] = new FirstClass();
			else if(choice == 1)
				cmp[i] = new Ladies();
			else if(choice == 2)
				cmp[i] = new General();
			else
				cmp[i] = new Luggage();
						
			cmp[i].Notice();	
		}
	}
}
