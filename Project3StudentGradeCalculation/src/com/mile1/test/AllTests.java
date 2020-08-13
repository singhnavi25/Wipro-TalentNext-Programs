package com.mile1.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.mile1.bean.Student;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

class AllTests 
{

	@Test
	void testTC1() // For A+ grade  
	{
		Student s = new Student("C1", new int [] {99,99,99});
		assertEquals("A+", new StudentReport().findGrades(s));
	}
	
	@Test
	void testTC2() //  For D grade but we have given minimum C
	{
		Student s = new Student("C1", new int [] {50,50,40});
		assertEquals("C", new StudentReport().findGrades(s));
	}
	
	@Test
	void testTC3() // For F grade
	{
		Student s = new Student("C1", new int [] {80,10,99});
		assertEquals("F", new StudentReport().findGrades(s));
	}
	
	@Test
	void testTC4() // If the Object is null
	{
		Student[] s = new Student[2];
		s[0] = new Student("C1", new int [] {80,10,99});
		s[1] = null;
		assertEquals(1, new StudentService().findNumberOfNullObjects(s));
	}
	
	@Test
	void testTC5() // If the Name is null
	{
		Student[] s = new Student[2];
		s[0] = new Student("C1", new int [] {80,10,99});
		s[1] = new Student(null, new int [] {13,88,13});
		assertEquals(1, new StudentService().findNumberOfNullName(s));
	}
	
	@Test
	void testTC6() // If the marks array is null
	{
		Student[] s = new Student[4];
		s[0] = new Student("C1", new int [] {80,10,99});
		s[1] = new Student(null, new int [] {13,88,13});
		s[2] = new Student ("A2", null);
		s[3] = new Student (null, null);
		assertEquals(2, new StudentService().findNumberOfNullName(s));
	}
	/*
	 * TC4 -- If the Object is null, throw NullStudentException ().
TC5-- If the Name is null, throw NullNameException ().
TC6 -- If the Marks array is null, throw NullMarksArrayException ().
COUNTING THE NULL:
TC7 – Test findNumberOfNullName function.
TC8 – Test findNumberOfNullObjects function.
TC9 -- Test findNumberOfNullMarks function.
	 */
}
