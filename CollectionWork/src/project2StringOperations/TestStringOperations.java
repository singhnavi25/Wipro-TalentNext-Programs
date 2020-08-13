package project2StringOperations;

import java.util.Scanner;

public class TestStringOperations 
{
	/*
	 * Write a Program to perform the basic operations like insert, delete, 
	 * display and search in list. List contains 
	 * String object items where these operations are to be performed.
	 * Sample Input and Output :
	 * 1. Insert
	 * 2. Search
	 * 3. Delete
	 * 4. Display
	 * 5. Exit
	 */
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		StringOperations stringOperations = new StringOperations();
		int choice;
		do
		{
			System.out.println("1. Insert");
			System.out.println("2. Search");
			System.out.println("3. Delete");
			System.out.println("4. Display");
			System.out.println("5. Exit");
			System.out.println("Enter your choice :");
			choice = sc.nextInt();
			switch(choice)
			{
				case 1:
					System.out.println("Enter the item to be inserted:");
					stringOperations.insert(sc.next());
					break;
				case 2:
					System.out.println("Enter the item to search :");
					stringOperations.search(sc.next());
					break;
				case 3:
					System.out.println("Enter the item to delete :");
					stringOperations.delete(sc.next());
					break;
				case 4:
					System.out.println("The Items in the list are :");
					stringOperations.display();
					break;
				case 5:
					break;
			}
		}while(choice!=5);
		sc.close();
	}
}
