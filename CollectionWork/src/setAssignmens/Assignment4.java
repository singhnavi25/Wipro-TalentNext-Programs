package setAssignmens;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Employee
{
	Set<String> country = new TreeSet<String>();
	public Set<String> saveCountryNames(String CountryName)
	{
		country.add(CountryName);
		return country;
	}
	public String getCountry(String CountryName)
	{
		for(Iterator<String> itr = country.iterator(); itr.hasNext(); )
			if(itr.next().equalsIgnoreCase(CountryName))
				return CountryName;
		return null;
	}
}
public class Assignment4 
{
	/*
	 * Implement the assignment 1 using TreeSets
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
