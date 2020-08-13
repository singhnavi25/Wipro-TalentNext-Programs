package project3CollectUniqueSymbolsFromSetOfCards;

public class Card implements Comparable<Card>
{
	private char symbol;
	private int value;
	public char getSymbol() 
	{
		return symbol;
	}
	public void setSymbol(char symbol)
	{
		this.symbol = symbol;
	}
	public int getValue()
	{
		return value;
	}
	public void setValue(int value)
	{
		this.value = value;
	}
	@Override
	public int compareTo(Card other) 
	{
		if(this.getSymbol() >= other.getSymbol())
			return 1;
		return -1;
	}
	@Override
	public String toString() 
	{
		return symbol + " " + value ;
	}
	
	@Override
	public int hashCode() 
	{
        return String.valueOf(symbol).hashCode();
	}
	@Override
    public boolean equals(Object obj)
	{
        return (obj instanceof Card) && ((Card) obj).getSymbol() == (this.symbol);
    }
}
