package javaFundamentals;

public class Arrays13 
{
	public static void main(String[] args)
	{
		// to print cmd args in reverse order of 2d matrix
		int check = (int) Math.sqrt(args.length);
		if(check * check == args.length)
		{
			int[][] arr = new int[check][check];
			int x = 0;
			for(int i=0; i<check; i++)
				for(int j=0; j<check; j++)
					arr[i][j] = Integer.parseInt(args[x++]);
			System.out.println("The given array is :");
			for(int i=0; i<check; i++)
			{
				for(int j=0; j<check; j++)
					System.out.print(arr[i][j] + " ");
				System.out.println();
			}
			System.out.println("The array after reverse :");
			for(int i=check-1; i>=0; i--)
			{
				for(int j=check-1; j>=0; j--)
					System.out.print(arr[i][j] + " ");
				System.out.println();
			}
		}
		else
			System.out.println("Provide proper square lenth args");
	}
}
