package abstractionPackagesExceptionHandling;

public class LibraryInterfaceDemo 
{
	public static void main(String[] args) 
	{
		KidUsers kid1 = new KidUsers();
		kid1.setAge(10);
		kid1.registerAccount();
		
		KidUsers kid2 = new KidUsers();
		kid2.setAge(18);
		kid2.registerAccount();
		
		kid1.setBookType("Kids");
		kid1.requestBook();
		
		kid2.setBookType("Fiction");
		kid2.requestBook();
		
		AdultUser adult1 = new AdultUser();
		adult1.setAge(5);
		adult1.registerAccount();
		
		AdultUser adult2 = new AdultUser();
		adult2.setAge(23);
		adult2.registerAccount();
		
		adult1.setBookType("Kids");
		adult1.requestBook();
		
		adult2.setBookType("Fiction");
		adult2.requestBook();
	}
}
