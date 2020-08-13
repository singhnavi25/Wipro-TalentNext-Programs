import java.io.Serializable;
import java.util.Scanner;

public class Employee implements Serializable
{
	int id;
	String name;
	int age;
	int salary;
	public static int count = 0;
	public Employee()
	{
		super();
		count++;
	}
	
	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getAge() 
	{
		return age;
	}

	public void setAge(int age) 
	{
		this.age = age;
	}

	public int getSalary() 
	{
		return salary;
	}

	public void setSalary(int salary) 
	{
		this.salary = salary;
	}

	public String toString()
	{
		return id + " " + name + " " + age + " " + salary;
	}
	
	public Employee getEmployee()
	{
		Scanner sc1 = new Scanner(System.in);
		Employee emp = new Employee();
		System.out.print("Enter Employee ID :");
		emp.setId(sc1.nextInt());
		System.out.print("Enter Employee Name :");
		emp.setName(sc1.next());
		System.out.print("Enter Employee Age :");
		emp.setAge(sc1.nextInt());
		System.out.print("Enter Employee Salary :");
		emp.setSalary(sc1.nextInt());
		sc1.close();
		return emp;
	}
}
