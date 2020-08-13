package javaFundamentals;

public class Arrays14 
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
			int max = Integer.MIN_VALUE;
			for(int i=0; i<check; i++)
				for(int j=0; j<check; j++)
					if(max < arr[i][j])
						max = arr[i][j];
			System.out.println("Maximum elements is :" + max);
		}
		else
			System.out.println("Provide proper square lenth args");
	}
}
