package setAssignmens;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Country
{
	Set<String> country = new HashSet<String>();
	public HashSet<String> saveCountryNames(String CountryName)
	{
		country.add(CountryName);
		return (HashSet<String>) country;
	}
	public String getCountry(String CountryName)
	{
		for(Iterator<String> itr = country.iterator(); itr.hasNext(); )
			if(itr.next().equalsIgnoreCase(CountryName))
				return CountryName;
		return null;
	}
}
public class Assignment1 
{
	/*
	 * Develop a java class with a instance variable Country  HashSet (H1)  
	 * add a method saveCountryNames(String CountryName) , the method should 
	 * add the passed country to a HashSet (H1) and return the added HashSet(H1).
	 * Develop a method getCountry(String CountryName) which iterates through the 
	 * HashSet and returns the country if exist else return null. 
	 * NOTE: You can test the methods using a main method.
	 */
	public static void main(String[] args) 
	{
		Country country = new Country();
		country.saveCountryNames("India");
		country.saveCountryNames("USA");
		country.saveCountryNames("Canda");
		country.saveCountryNames("Japan");
		country.saveCountryNames("New York");
		
		System.out.println("Check for Japan :" + country.getCountry("JAPAN"));
		System.out.println("Check for Bhutan :" + country.getCountry("Bhutan"));
		
		System.out.println(country.country);
	}
}
