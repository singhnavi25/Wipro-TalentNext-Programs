package mapAssignments;

public class LinkedHashMapExample 
{
	/*
	 * Implement the assignment 1 using LinkedHashMap
	 */
	public static void main(String[] args) 
	{
		CountryMap3 map = new CountryMap3();
		// step 1
		map.saveCountryCapital("Japan", "Tokyo");
		map.saveCountryCapital("Qatar", "Doha");
		map.saveCountryCapital("India", "New Delhi");
		map.saveCountryCapital("Canada", "Ottawa");
		System.out.println(map.saveCountryCapital("Russia", "Moscow"));
		System.out.println();
		
		// step 2
		System.out.println("Capital of Canada is :" + map.getCapital("Canada"));
		System.out.println();
		
		// step 3
		System.out.println("New Delhi is the capital of :" + map.getCountry("New Delhi"));
		System.out.println();
		
		// step 4
		System.out.println("After change to captital to key and country to value :");
		System.out.println(map.getCountryToCapitalChange());
		System.out.println();
		
		// step 5
		System.out.println("ArrayList of Countries is :");
		System.out.println(map.getArrayListOfCountriesName());
		System.out.println();
	}
}
