package ioStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ObjectSerializationAndDeserialization4 
{
	/*
	 *  Create an employee object having properties name, date of birth, 
	 *  department, designation and salary. Let the employee class have 
	 *  appropriate getter/setters methods for accessing these properties. 
	 *  Initialize these properties through the setter methods. Store this object 
	 *  into a file "OutObject.txt". Read the same object from the same file and display 
	 *  its properties through getter methods.
	 */
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		
		System.out.print("Enter name: ");
		emp.setName(sc.nextLine());
		
		System.out.print("Enter D.O.B.: ");
		emp.setDob(sc.nextLine());
		
		System.out.print("Enter department: ");
		emp.setDepartment(sc.nextLine());
		
		System.out.print("Enter designation: ");
		emp.setDesignation(sc.nextLine());
		
		System.out.print("Enter salary: ");
		emp.setSalary(sc.nextDouble());
		
		sc.nextLine();
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try
		{
			fos = new FileOutputStream("src\\ioStreams\\OutObject.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(emp);
			
			fis = new FileInputStream("src\\ioStreams\\OutObject.txt");
			ois = new ObjectInputStream(fis);
			
			Employee emp2;
			try 
			{
				emp2 = (Employee) ois.readObject();
				System.out.println("Name: " + emp2.getName());
				System.out.println("D.O.B.: " + emp2.getDob());
				System.out.println("Department: " + emp2.getDepartment());
				System.out.println("Designation: " + emp2.getDesignation());
				System.out.println("Salary: " + emp2.getSalary());
			} 
			catch (ClassNotFoundException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		catch(IOException e)
		{
    		e.printStackTrace();
    	}
		finally
		{
			try
			{
				if(fos!=null)
					fos.close();
			}
			catch(IOException r)
			{
				System.out.println("File not found");
			}
			try
			{
				if(oos!=null)
					oos.close();
			}
			catch(IOException r)
			{
				System.out.println("File not found");
			}
			try
			{
				if(fis!=null)
					fis.close();
			}
			catch(IOException r)
			{
				System.out.println("File not found");
			}
			try
			{
				if(ois!=null)
					ois.close();
			}
			catch(IOException r)
			{
				System.out.println("File not found");
			}
			sc.close();
		}
	}
}
