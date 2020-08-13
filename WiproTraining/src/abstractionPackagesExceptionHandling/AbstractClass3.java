package abstractionPackagesExceptionHandling;

import java.util.Random;

abstract class Instrument
{
	abstract void play();
}
class Piano extends Instrument
{
	@Override
	void play() 
	{
		// TODO Auto-generated method stub
		System.out.println("Piano is playing  tan tan tan tan");
	}	
}
class Flute extends Instrument
{
	@Override
	void play() 
	{
		// TODO Auto-generated method stub
		System.out.println("Flute is playing  toot toot toot toot");
	}
}
class Guitar extends Instrument
{
	@Override
	void play() 
	{
		// TODO Auto-generated method stub
		System.out.println("Guitar is playing  tin  tin  tin");
	}
}
public class AbstractClass3 
{
	public static void main(String[] args) 
	{
		Instrument[] instrument = new Instrument[10];
		Random random = new Random();
		for(int i=0; i<10; i++)
		{
			int choice = random.nextInt(3);
			if(choice == 0)
				instrument[i] = new Piano();
			else if(choice == 1)
				instrument[i] = new Flute();
			else if(choice == 2)
				instrument[i] = new Guitar();
						
			instrument[i].play();
			if(instrument[i] instanceof Piano) 
				System.out.println("InstanceOf Piano"); 
			else if(instrument[i] instanceof Flute) 
				System.out.println("InstanceOf Flute"); 
			else 
				System.out.println("InstanceOf Guitar");
			System.out.println();
		}
	}
}
