package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class StudentMain 
{
	static Student[] data = new Student[4];
	StudentMain () 
	{// Constructor 
		for (int i = 0; i < data. length; i++) 
		{
			data [i]= new Student (); 
		}
		// initialize the objects 
		data [0] = new Student ("Sekar", new int [] {85,75,95});
		data [1] = new Student (null, new int[]{11,22,33});
		data [2] = null;
		data [3] = new Student ("Manoj", null);
	}
	public static void main(String[] args) 
	{
		new StudentMain();
		StudentService studentService = new StudentService ();	
		System.out.println("Number of null marks array :" + studentService.findNumberOfNullMarksArray(data));
		System.out.println("Number of null name :" + studentService.findNumberOfNullName(data));
		System.out.println("Number of null objects :" + studentService.findNumberOfNullObjects(data));
		
		StudentReport studentReport = new StudentReport();
		try
		{
			for(int i=0; i<data.length; i++)
				System.out.println(studentReport.validate(data[i]));
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
	}
}
