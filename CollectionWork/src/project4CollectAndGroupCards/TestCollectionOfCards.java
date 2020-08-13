package project4CollectAndGroupCards;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class TestCollectionOfCards 
{
	public static void main(String[] args) 
	{
		Map<Character, ArrayList<Cards>> cardsDetails = new TreeMap<Character, ArrayList<Cards>>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Cards :");
		int totalCards = sc.nextInt();
		for(int i=0; i<totalCards; i++)
		{
			System.out.println("Enter card " + (i + 1) + ":");
			Cards card = new Cards();
			card.setSymbol(sc.next().charAt(0));
			card.setValue(sc.nextInt());
			
			if(cardsDetails.containsKey(card.getSymbol()))
				cardsDetails.get(card.getSymbol()).add(card);
			else
			{
				ArrayList<Cards> temp = new ArrayList<Cards>();
				temp.add(card);
				cardsDetails.put(card.getSymbol(), temp);
			}
		}
		
		System.out.println("Distinct Symbols are :");
		Set<Entry<Character, ArrayList<Cards>>> set = cardsDetails.entrySet();
		Iterator<Entry<Character, ArrayList<Cards>>> itr = set.iterator();
		while (itr.hasNext()) 
			System.out.print(itr.next().getKey() + " ");
		
		System.out.println();
		
		itr = set.iterator();
		
		while (itr.hasNext()) 
		{
			int sum = 0;
			
			Map.Entry<Character, ArrayList<Cards>> me = itr.next();
			ArrayList<Cards> list = me.getValue();
			
			System.out.println("Cards in " + me.getKey() + " Symbol");
			
			for (Cards card : list) 
			{
				System.out.println(card.getSymbol() + " " + card.getValue());
				sum += card.getValue();
			}
			
			System.out.println("Number of cards : " + list.size());
			System.out.println("Sum of Numbers : " + sum);
		}
		sc.close();
	}
}
