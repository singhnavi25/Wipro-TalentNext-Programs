package listAssignments;

public class Assignment2 
{
	/*
	 * Create an Employee class with the related attributes and behaviours. Create
	 * one more class EmployeeDB which has the following methods. a. boolean
	 * addEmployee(Employee e) b. boolean deleteEmployee(int eCode) c. String
	 * showPaySlip(int eCode) d. Employee[] listAll() Use an ArrayList which will be
	 * used to store the emplyees and use enumeration/iterator to process the
	 * employees. Write a Test Program to test that all functionalities are
	 * operational.
	 */
	public static void main(String[] args) 
	{
		EmployeeDB empDB = new EmployeeDB();
 

		empDB.addEmployee(new Employee(1, "Manjot Singh", "navicu25@gmail.com", 'M', 125000));
		empDB.addEmployee(new Employee(2, "Navi Singh", "manjotsingh000100010001@gmail.com", 'M', 130000));
		empDB.addEmployee(new Employee(3, "Komal", "firstkomal@gmail.com", 'F', 220000));
		empDB.addEmployee(new Employee(4, "Noor", "orderofnoor@gmail.com", 'F', 450000));

		for (Employee emp : empDB.listAll())
			System.out.println(emp.toString());

		System.out.println();
		empDB.deleteEmployee(3);

		for (Employee emp : empDB.listAll())
			System.out.println(emp.toString());

		System.out.println();

		System.out.println(empDB.showPaySlip(103));
	}
}
