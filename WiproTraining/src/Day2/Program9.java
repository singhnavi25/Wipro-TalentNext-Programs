package Day2;

public class Program9 
{
	public static void main(String[] args)
	{
		// print 100 to 1 by skipping 2 numbers 100, 97, 94, ..., 1
		for(int i = 100; i >= 1; i-=3)
			System.out.print(i + " ");
	}
}
