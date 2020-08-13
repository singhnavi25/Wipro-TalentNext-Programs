package project5SetOfBoxes;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TestBoxClass 
{
	/*
	 * Create a Box Class and its attributes are length (Double), width (Double) 
	 * and height (Double).
	 * Get the Box details from the user and insert it to the Set.
	 * We need to store the details of boxes with different volumes. When the volume 
	 * of a new box is the same as the volumes of a previous box included in the Set, 
	 * dont insert this box in the Set.
	 * The Box is said to be same when their volumes are the equal.
	 * Override the equals method to compare the box volumes.
	 */
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Box");
		int totalBoxes = sc.nextInt();
		Set<Box> boxes = new TreeSet<Box>();
		for(int i=0; i<totalBoxes; i++)
		{
			Box temp = new Box();
			System.out.println("Enter the Box " + (i + 1) + " details");
			System.out.println("Enter Length");
			temp.setLength(sc.nextDouble());
			System.out.println("Enter Width");
			temp.setWidth(sc.nextDouble());
			System.out.println("Enter Height");
			temp.setHeight(sc.nextDouble());
			
			boxes.add(temp);
		}
		System.out.println("Unique Boxes in the Set are");
		for(Box itr: boxes)
			System.out.println(itr);
		sc.close();
	}
}
