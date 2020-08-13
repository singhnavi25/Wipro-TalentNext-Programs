package oopsAndInheritance;
class Person
{
	String name;

	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
}
class Employee extends Person
{
	double salary;
	int joiningYear;
	String insuranceNumber;
	public double getSalary() 
	{
		return salary;
	}
	public void setSalary(double salary) 
	{
		this.salary = salary;
	}
	public int getJoiningYear() 
	{
		return joiningYear;
	}
	public void setJoiningYear(int joiningYear) 
	{
		this.joiningYear = joiningYear;
	}
	public String getInsuranceNumber() 
	{
		return insuranceNumber;
	}
	public void setInsuranceNumber(String insuranceNumber) 
	{
		this.insuranceNumber = insuranceNumber;
	}
}
public class Inheritance2 
{
	public static void main(String[] args) 
	{
		Employee emp = new Employee();
		emp.setName("Manjot Singh");
		emp.setSalary(50000);
		emp.setJoiningYear(2020);
		emp.setInsuranceNumber("17BCS2756");
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
		System.out.println(emp.getJoiningYear());
		System.out.println(emp.getInsuranceNumber());
	}
}
