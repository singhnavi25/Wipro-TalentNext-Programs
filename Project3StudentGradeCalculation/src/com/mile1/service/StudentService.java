package com.mile1.service;

import com.mile1.bean.Student;

public class StudentService 
{
	public int findNumberOfNullMarksArray(Student[] s) 
	{
		int x=0;
        for(int i=0; i<s.length; i++)
     	   if(s[i]!=null && s[i].getMarks()==null)
     		   x++;
        return x;
	}
	public int findNumberOfNullName(Student[] s) 
	{
		int x=0;
        for(int i=0; i<s.length; i++)
     	   if(s[i]!=null && s[i].getName()==null)
     		   x++;
        return x;
	}
	public int findNumberOfNullObjects (Student[] s) 
	{
		int x=0;
        for(int i=0; i<s.length; i++)
     	   if(s[i]==null)
     		   x++;
        return x;
	}
}
