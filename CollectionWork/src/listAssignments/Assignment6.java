package listAssignments;

import java.util.LinkedList;

public class Assignment6 
{
	/*
	 * Implement the assignment 1 using Linked List
	 */
	LinkedList<Integer> a1 = null;
	public LinkedList<Integer> saveEvenNumbers(int N)
	{
		a1 = new LinkedList<>();
		for(int i=2; i<=N; i+=2)
			a1.add(i);
		return a1;
	}
	public LinkedList<Integer> printEvenNumbers()
	{
		LinkedList<Integer> a2 = new LinkedList<>();
		for(Integer i: a1)
		{
			a2.add(i*2);
			System.out.print(i * 2 + " ");
		}
		System.out.println();
		return a2;
	}
	public int printEvenNumber(int N)
	{
		if(a1.contains(N))
			return N;
		return 0;
	}
	public static void main(String[] args) 
	{
		Assignment1 as = new Assignment1();
		as.saveEvenNumbers(16);
		as.printEvenNumbers();
		System.out.println(as.printEvenNumber(12));;
	}
}
