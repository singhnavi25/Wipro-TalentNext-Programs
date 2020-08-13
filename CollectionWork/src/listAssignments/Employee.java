package listAssignments;

public class Employee 
{
	private int empId;  // helps in Assignment 4
	private String empName; // helps in Assignment 4
	private String empEmail; // helps in Assignment 4
	private char empGender; // helps in Assignment 4
	private float empSalary; // helps in Assignment 4
	private String address; // helps in Assignment 5
	public Employee()  // helps in Assignment 4
	{
		super();
	}
	
	
	public Employee(int empId, String empName, float empSalary, String address) 
	{
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.address = address;
	}


	public Employee(int empId, String empName, String empEmail, char empGender, float empSalary)  // helps in Assignment 4
	{
		super();
		this.empId = empId;
		this.empName = empName;
		this.empEmail = empEmail;
		this.empGender = empGender;
		this.empSalary = empSalary;
	}
	public int getEmpId() 
	{
		return empId;
	}
	public void setEmpId(int empId) 
	{
		this.empId = empId;
	}
	public String getEmpName() 
	{
		return empName;
	}
	public void setEmpName(String empName) 
	{
		this.empName = empName;
	}
	public String getEmpEmail() 
	{
		return empEmail;
	}
	public void setEmpEmail(String empEmail) 
	{
		this.empEmail = empEmail;
	}
	public char getEmpGender() 
	{
		return empGender;
	}
	public void setEmpGender(char empGender) 
	{
		this.empGender = empGender;
	}
	public float getEmpSalary() 
	{
		return empSalary;
	}
	public void setEmpSalary(float empSalary) 
	{
		this.empSalary = empSalary;
	}
	@Override
	public String toString() 
	{
		return "Employee [empId=" + empId + ", empName=" + empName + ", empEmail=" + empEmail + ", empGender="
				+ empGender + ", empSalary=" + empSalary + "]";
	}
	
}
