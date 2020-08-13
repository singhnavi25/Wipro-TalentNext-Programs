package abstractionPackagesExceptionHandling;

import test.Foundation;
public class PackagesAs1 
{
	public static void main(String[] args) 
	{
		Foundation f = new Foundation();
//		Var1 is private so this can be accessed outside the class
//		we can access this using getter or setter method
		//System.out.println(f.Var1);
		
		
//		Var2 is accessed in the same package because this is dafault modifier
		//System.out.println(f.Var2);
		
		
//		Var3 is set as protected and this will access outside package using inheritance only
		//System.out.println(f.Var3);
		
		
		
//		Var4 is public this can be accessed outside the package and withoud inheritance also
		System.out.println(f.Var4);
	}
}
