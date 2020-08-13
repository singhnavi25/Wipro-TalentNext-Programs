package oopsAndInheritance;
class Person1
{
	private String name;
	public Person1(String name) 
	{
		this.name = name;
	}
	@Override
	public String toString() 
	{
		return "name=" + name;
	}
	
}
class Student extends Person1
{
	private String id;
	public Student(String name, String id) 
	{
		super(name);
		this.id = id;
	}
	@Override
	public String toString() 
	{
		return super.toString() + ", id=" + id;
	}
	
}
class Teacher extends Person1
{
	private int salary;
	private String subject;
	public Teacher(String name, int salary, String subject) 
	{
		super(name);
		this.salary = salary;
		this.subject = subject;
	}
	@Override
	public String toString() 
	{
		return "Teacher [" + super.toString() + ", salary=" + salary + ", subject=" + subject + "]";
	}	
	
}
class CollegeStudent extends Student
{
	private int currentYear;
	private String major;
	public CollegeStudent(String name, String id, int currentYear, String major) 
	{
		super(name, id);
		this.currentYear = currentYear;
		this.major = major;
	}
	@Override
	public String toString() 
	{
		return "CollegeStudent [" + super.toString() + ", currentYear=" + currentYear + ", major=" + major + "]";
	}	
	
}
public class Inheritance3 
{
	public static void main(String[] args) 
	{
		Teacher t1 = new Teacher("Navi", 120000, "Computer Sciene");
		System.out.println(t1);
		CollegeStudent cs = new CollegeStudent("Manjot Singh", "17BCS2756", 2020, "Computer Science");
		System.out.println(cs);
	}
}
