package listAssignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class EmployeeDB 
{
	/*
	 * Create one more class EmployeeDB which has the following methods. 
	 * a. boolean addEmployee(Employee e) 
	 * b. boolean deleteEmployee(int eCode) 
	 * c. String showPaySlip(int eCode) 
	 * d. Employee[] listAll() 
	 */
	List<Employee> list = new ArrayList<>();
	
	public boolean addEmployee(Employee e) 
	{
		return list.add(e);
	}
	
	public boolean deleteEmployee(int eCode)
	{
		for(Iterator<Employee> emp = list.iterator(); emp.hasNext();)
			if(emp.next().getEmpId() == eCode)
			{
				emp.remove();
				return true;
			}
		return false;
	}
	
	public String showPaySlip(int eCode)
	{
		for (Employee emp : list) 
			if (emp.getEmpId() == eCode) 
				return "Pay slip for employee id " + eCode + " is " + emp.getEmpSalary();
		return "Invalid employee id :" + eCode;
	}
	
	public Employee[] listAll() 
	{
		Employee[] empArray = new Employee[list.size()];
		Enumeration<Employee> e = Collections.enumeration(list);
		int i = 0;
		while (e.hasMoreElements()) 
            empArray[i++] = e.nextElement();
		return empArray;
	}
}
