package listAssignments;

import java.util.Vector;

public class Assignment7 
{
	/*
	 * Implement the assignment 1 using Vector
	 */
	Vector<Integer> a1 = null;
	public Vector<Integer> saveEvenNumbers(int N)
	{
		a1 = new Vector<>();
		for(int i=2; i<=N; i+=2)
			a1.add(i);
		return a1;
	}
	public Vector<Integer> printEvenNumbers()
	{
		Vector<Integer> a2 = new Vector<>();
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
