package WrapperClasses;

class Employee implements Cloneable 
{
	private String name;

	public Employee(String name) 
	{
		this.name = name;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	@Override
	public Employee clone() 
	{
		try 
		{
			return (Employee) super.clone();
		} 
		catch (CloneNotSupportedException e) 
		{
			System.out.println("Cloning Not Allowed");
			return this;
		}		
	}
}

public class WrapperClasses4 
{
	/*
	 * Create an employee object and initialize its properties. Create a clone of this object 
	 * and store it in a different object. Now change the properties of the first employee 
	 * object. Print both the objects and observe the change.
	 */
	public static void main(String[] args) 
	{
		Employee emp = new Employee("Manjot Singh");
		Employee copy = emp.clone();
		System.out.println(emp.getName());
		System.out.println(copy.getName());
		System.out.println();
		
		emp.setName("Navi Singh");
		System.out.println("After changing first object value\n");
		
		System.out.println(emp.getName());
		System.out.println(copy.getName());
	}
}
