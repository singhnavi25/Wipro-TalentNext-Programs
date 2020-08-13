package mapAssignments;

public class Assignment1 
{
	/*
	 * Develop a java class with a instance variable CountryMap  HashMap (M1)  
	 * add a method saveCountryCapital(String CountryName, String capital) , 
	 * the method should add the passed country and capital as key/value in the map M1 and return the Map (M1).
	 * Key- Country                          Value - Capital
	 * India                                      Delhi
	 * Japan 									  Tokyo
	 * 
	 * 2. Develop a method getCapital(String CountryName) which returns the capital for the 
	 * country passed from the Map M1 created in step 1.
	 * 
	 * 3. Develop a method getCountry(String capitalName) which returns the country
	 * for the capital name passed from the Map M1 created in step 1.
	 * 
	 * 4. Develop a method which iterates through the map M1 and creates another map M2 
	 * with Capital as the key and value as Country and returns the Map M2.
	 * Key – Capital                    Value – Country
	 * Delhi                                 India
	 * Tokyo                                 Japan
	 * 
	 * 5. Develop a method which iterates through the map M1 and creates an ArrayList with 
	 * all the Country names stored as keys. This method should return the ArrayList.
	 * NOTE: You can test the methods using a main method. 
	 */
	public static void main(String[] args) 
	{
		CountryMap map = new CountryMap();
		// step 1
		map.saveCountryCapital("Japan", "Tokyo");
		map.saveCountryCapital("Qatar", "Doha");
		map.saveCountryCapital("India", "New Delhi");
		map.saveCountryCapital("Canada", "Ottawa");
		map.saveCountryCapital("Russia", "Moscow");
		
		// step 2
		System.out.println("Capital of Canada is :" + map.getCapital("Canada"));
		
		// step 3
		System.out.println("New Delhi is the capital of :" + map.getCountry("New Delhi"));
		
		// step 4
		System.out.println("After change to captital to key and country to value :");
		System.out.println(map.getCountryToCapitalChange());
		
		// step 5
		System.out.println("ArrayList of Countries is :");
		System.out.println(map.getArrayListOfCountriesName());
	}
}
