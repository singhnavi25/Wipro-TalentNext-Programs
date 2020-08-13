
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu 
{
	public static void main(String[] args) throws IOException, Exception
	{
		Scanner sc = new Scanner(System.in);
		File file = new File("src\\EmployeeData.ser");
		if(!file.exists())
			file.createNewFile();
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		ArrayList<Employee> list = null;
//		int choice = 0;
		int temp = 1;
		while(true)
		{
			System.out.println("Main Menu");
			System.out.println("1. Add an Employee");
			System.out.println("2. Display All");
			System.out.println("3. Exit");
			if(temp>1)
				sc.nextLine();
			int choice = sc.nextInt();
			boolean flag = true;
			switch(choice)
			{
				case 1:
					Employee emp = new Employee().getEmployee();
					
					if(file.length()!=0)
					{
						fis = new FileInputStream(file);
						
						ois = new ObjectInputStream(fis);
						list = (ArrayList<Employee>) ois.readObject();
						
						ois.close();
						fis.close();
					}
					else
						list = new ArrayList<Employee>();
					
					list.add(emp);
					fos = new FileOutputStream(file);
					oos = new ObjectOutputStream(fos);
					oos.writeObject(list);
					list.clear();
					oos.flush();
					oos.close();
					fos.close();
					System.out.println();
					break;
					
				case 2:
					System.out.println("---Report---");
					if(file.length()!=0)
					{
						fis = new FileInputStream(file);
						ois = new ObjectInputStream(fis);
						
						while (fis.available() > 0) 
						{
							list =  (ArrayList<Employee>) ois.readObject();
						}
						
						for(Employee e: list)
							System.out.println(e.toString());
						ois.close();
						fis.close();
					}
					System.out.println("---End of Report---");
					break;
				case 3:
					System.out.println("Exiting the System");
					flag = false;
					break;
			}
			temp++;
			if(!flag)
				break;
		}
		sc.close();
	}
}
