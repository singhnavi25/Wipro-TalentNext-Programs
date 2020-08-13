package project4CollectAndGroupCards;

public class Cards
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
	public String toString() 
	{
		return symbol + " " + value ;
	}
	
}
