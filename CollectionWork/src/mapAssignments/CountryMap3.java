package mapAssignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class CountryMap3 
{
	private LinkedHashMap<String, String> M1;
	public CountryMap3()
	{
		M1 = new LinkedHashMap<String, String>();
	}
	// step 1
	public LinkedHashMap<String, String> saveCountryCapital(String CountryName, String capital)
	{
		M1.put(CountryName, capital);
		return M1;
	}
	
	// step 2
	public String getCapital(String CountryName)
	{
		return M1.get(CountryName);
	}
	
	// step 3
	public String getCountry(String capitalName)
	{
		Set set = M1.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext())
		{
			Map.Entry<String, String> me = (Entry<String, String>) itr.next();
			if(me.getValue().equals(capitalName))
				return me.getKey();
		}
		return null;
	}
	
	// step 4
	public HashMap<String, String> getCountryToCapitalChange()
	{
		HashMap<String, String> M2 = new HashMap<String, String>();
		for(String country: M1.keySet())
			M2.put(M1.get(country), country);
		return M2;
	}
	
	// step 4
	public ArrayList<String> getArrayListOfCountriesName()
	{
		ArrayList<String> countriesName = new ArrayList<String>();
		M1.forEach((key, value) -> countriesName.add(key)); 
		return countriesName;
	}
}
