package abstractionPackagesExceptionHandling;

import com.automobie.TwoWheeler.Hero;
import com.automobie.TwoWheeler.Honda;
public class PackagesAs3 
{
	public static void main(String[] args) 
	{
		Hero hero = new Hero("Hero", "Manjot Singh", "17BCS2756", 190);
		System.out.println("Model name :" + hero.getModelName());
		System.out.println("Registration number :" + hero.getRegistrationNumber());
		System.out.println("Owner Name :" +hero.getOwnerName());
		System.out.println("Speed :" + hero.getSpeed());
		hero.radio();
		
		System.out.println();
		
		Honda honda = new Honda("Honda", "Navi Singh", "Rj311984", 230);
		System.out.println("Model name :" + honda.getModelName());
		System.out.println("Registration number :" + honda.getRegistrationNumber());
		System.out.println("Owner Name :" +honda.getOwnerName());
		System.out.println("Speed :" + honda.getSpeed());
//		honda.cdplayer();
	}
}
