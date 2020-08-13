package project3CollectUniqueSymbolsFromSetOfCards;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class TestCard 
{
	/*
	 * Playing cards during travel is a fun filled experience. For this game they 
	 * wanted to collect all four unique symbols. Can you help these guys to collect
	 * unique symbols from a set of cards?
	 * Create Card class with attributes symbol and number. From our main method collect
	 * each card details (symbol and number) from the user.
	 * Collect all these cards in a set, since set is used to store unique values or 
	 * objects. 
	 * Once we collect all four different symbols display the first occurrence of card 
	 * details in alphabetical order.
	 */
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Set<Card> setOfCards = new HashSet<Card>();
		Card card = null;
		for(int i=0; i<8; i++)
		{
			card = new Card();
			System.out.println("Enter a card :");
			card.setSymbol(sc.next().charAt(0));
			card.setValue(sc.nextInt());
			setOfCards.add(card);
		}
		
		System.out.println("Four symbols gathered in 8 cards.");
		System.out.println("Cards in Set are :");
		
		for(Iterator<Card> itr = setOfCards.iterator(); itr.hasNext(); )
			System.out.println(itr.next().toString());
		sc.close();
	}
}
