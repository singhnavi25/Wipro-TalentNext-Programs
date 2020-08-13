package ioStreams.practices;

import java.io.Serializable;

public class MyDetails implements Serializable
{
	private String name;
	private transient int id; // I don't want to store id in file
	private static float salary; // static variables are not serialized
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static float getSalary() {
		return salary;
	}

	public static void setSalary(float salary) {
		MyDetails.salary = salary;
	}

	@Override
	public String toString() 
	{
		return "MyDetails [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}
	
}
