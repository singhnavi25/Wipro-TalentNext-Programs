package abstractionPackagesExceptionHandling;
abstract class GeneralBank
{
	abstract double getSavingInterestRate();
	abstract double getFixedInterestRate();
}
class ICICIBank extends GeneralBank
{
	@Override
	double getSavingInterestRate() 
	{
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	double getFixedInterestRate() 
	{
		// TODO Auto-generated method stub
		return 8.5;
	}
}
class KotMBank extends GeneralBank
{
	@Override
	double getSavingInterestRate() 
	{
		// TODO Auto-generated method stub
		return 6;
	}

	@Override
	double getFixedInterestRate() 
	{
		// TODO Auto-generated method stub
		return 9;
	}
	
}
public class AbstractClass1 
{
	public static void main(String[] args) 
	{
		ICICIBank ic = new ICICIBank();
		System.out.println("ICICI Bank saving interest rate : " + ic.getSavingInterestRate() +"%");
		System.out.println("ICICI Bank fixed interest rate : " + ic.getFixedInterestRate() +"%");
		KotMBank km = new KotMBank();
		System.out.println("KotM Bank saving interest rate : " + km.getSavingInterestRate() +"%");
		System.out.println("KotM Bank fixed interest rate : " + km.getFixedInterestRate() +"%");
		GeneralBank gmBank;
		gmBank = new KotMBank();
		System.out.println("KotM Bank saving interest rate : " + gmBank.getSavingInterestRate() +"%");
		System.out.println("KotM Bank fixed interest rate : " + gmBank.getFixedInterestRate() +"%");
		gmBank = new ICICIBank();
		System.out.println("ICICI Bank saving interest rate : " + gmBank.getSavingInterestRate() +"%");
		System.out.println("ICICI Bank fixed interest rate : " + gmBank.getFixedInterestRate() +"%");
	}
}
