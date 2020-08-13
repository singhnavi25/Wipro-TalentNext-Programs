package abstractionPackagesExceptionHandling.live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test 
{
	public static void main(String[] args) 
	{
		Veena veena = new Veena(); // instance os Veena
		veena.play();
		
		Saxophone saxophone = new Saxophone();// instance os Saxophone
		saxophone.play();
		
		Playable playable;
		playable = veena;
		playable.play(); // veena instance in playable
		
		playable = saxophone; // saxophone instance in playable
		playable.play();
	}
}
