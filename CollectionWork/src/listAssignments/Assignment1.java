package listAssignments;

import java.util.ArrayList;

public class Assignment1 
{
	/*
	 * Develop a java class with a method saveEvenNumbers(int N) using ArrayList to store even numbers 
	 * from 2 to N, where N is a integer which is passed as a parameter to the method saveEvenNumbers().
	 * The method should return the ArrayList (A1) created. 
	 * 
	 * In the same class create a method printEvenNumbers()which iterates through the arrayList A1 in step 1,
	 * and It should multiply each number with 2 and display it in format 4,8,12….2*N. and add these numbers 
	 * in a new ArrayList (A2). The new ArrayList (A2) created needs to be returned. 
	 * 
	 * Create a method printEvenNumber(int N) parameter is a number N. This method should search the arrayList 
	 * (A1) for the existence of the number ‘N’ passed.  If exists it should return the Number else return zero.
	 * Hint:  Use instance variable for storing the ArrayList A1 and A2.
	 * NOTE: You can test the methods using a main method.
	 */
	ArrayList<Integer> a1 = null;
	public ArrayList<Integer> saveEvenNumbers(int N)
	{
		a1 = new ArrayList<>();
		for(int i=2; i<=N; i+=2)
			a1.add(i);
		return a1;
	}
	public ArrayList<Integer> printEvenNumbers()
	{
		ArrayList<Integer> a2 = new ArrayList<>();
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
