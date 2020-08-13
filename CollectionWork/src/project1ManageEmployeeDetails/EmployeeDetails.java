package project1ManageEmployeeDetails;

public class EmployeeDetails implements Comparable<EmployeeDetails>
{
	/*
	 * You need to maintain the details of all employees of an Organization.
	 * The following details of the employee needs to be maintained
	 * First Name 
	 * Last Name 
	 * Mobile Number 
	 * Email 
	 * Address
	 */
	private String firstName;
	private String lastName;
	private long mobile;
	private String email;
	private String address;
	public EmployeeDetails() 
	{
		super();
	}
	public EmployeeDetails(String firstName, String lastName, long mobile, String email, String address) 
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobile = mobile;
		this.email = email;
		this.address = address;
	}
	public String getFirstName() 
	{
		return firstName;
	}
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	public String getLastName() 
	{
		return lastName;
	}
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	public long getMobile() 
	{
		return mobile;
	}
	public void setMobile(long mobile) 
	{
		this.mobile = mobile;
	}
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	@Override
	public int compareTo(EmployeeDetails other) 
	{
		// TODO Auto-generated method stub
		return this.firstName.compareTo(other.getFirstName());
	}
	
}
