package project;

public class UserBean 
{
	private String id;
	private String password;
	private String name;
	private int incorrectAttempts;
	private int lockStatus; 
	private String UserType;
	public String getId() 
	{
		return id;
	}
	public void setId(String id) 
	{
		this.id = id;
	}
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getIncorrectAttempts() 
	{
		return incorrectAttempts;
	}
	public void setIncorrectAttempts(int incorrectAttempts)
	{
		this.incorrectAttempts = incorrectAttempts;
	}
	public int getLockStatus() 
	{
		return lockStatus;
	}
	public void setLockStatus(int lockStatus) 
	{
		this.lockStatus = lockStatus;
	}
	public String getUserType() 
	{
		return UserType;
	}
	public void setUserType(String userType) 
	{
		UserType = userType;
	}
	@Override
	public String toString() {
		return "UserBean [id=" + id + ", password=" + password + ", name=" + name + ", incorrectAttempts="
				+ incorrectAttempts + ", lockStatus=" + lockStatus + ", UserType=" + UserType + "]";
	}
	
}
