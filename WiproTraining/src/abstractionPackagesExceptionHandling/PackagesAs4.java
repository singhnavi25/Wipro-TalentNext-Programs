package abstractionPackagesExceptionHandling;

import com.automobie.FourWheeler.Ford;
import com.automobie.FourWheeler.Logan;
public class PackagesAs4 
{
	public static void main(String[] args) 
	{
		Logan logan = new Logan("Logan", "Manot Singh", "RJ131147", 65, 1147);
		System.out.println("Model name :" + logan.getModelName());
		System.out.println("Registration number :" + logan.getRegistrationNumber());
		System.out.println("Owner Name :" +logan.getOwnerName());
		System.out.println("Speed :" + logan.getSpeed());
		System.out.println("Gps :" + logan.gps());
		
		System.out.println();
		
		Ford ford = new Ford("Ford", "Navi Singh", "RJ139696", 80, 48);		
		System.out.println("Model name :" + ford.getModelName());
		System.out.println("Registration number :" + ford.getRegistrationNumber());
		System.out.println("Owner Name :" +ford.getOwnerName());
		System.out.println("Speed :" + ford.getSpeed());
		System.out.println("Temperature  :" + ford.tempControl());
	}
}
