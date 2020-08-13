package listAssignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Assignment4 
{
	/*
	 * Create an ArrayList which will be able to store only numbers 
	 * like int,float,double,etc, but not any other data type
	 */
	public static void main(String[] args) 
	{
		List<Object> list = new MyList<Object>();
		try 
		{
			list.add(2756);
			list.add(275.6F);
			list.add(2.756D);
			list.add("2756");
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println("Inserted values are :");
			Iterator itr = list.iterator();
			while(itr.hasNext())
				System.out.println(itr.next());
		}
	}
}

class MyList<E> extends ArrayList<E>
{
	@Override
	public boolean add(E data) throws ClassCastException
	{
		// TODO Auto-generated method stub
		if (data instanceof Integer || data instanceof Float || data instanceof Double) 
		{
			super.add(data);
			return true;
		} 
		throw new ClassCastException("Only Integer, Float, and Double are stored.");
	}
}