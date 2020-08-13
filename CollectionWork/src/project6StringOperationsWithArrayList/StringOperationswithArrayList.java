package project6StringOperationsWithArrayList;

import java.util.ArrayList;
import java.util.List;

public class StringOperationswithArrayList 
{
	/*
	 * Create a method which can perform the following operations on two String objects S1 and S2. The output of 
	 * each operation should be added to an arraylist and the arraylist should be returned.(Assume S2 is of smaller size)
	 * Examples for below statements are shown in the Logic part 
	 * 1. Character in each alternate index of S1 should be replaced with S2 
	 * 2. If S2 appears more than once in S1, replace the last occurrence of S2 in S1 with the reverse of S2, 
	 * else return S1+S2 
	 * 3. If S2 appears more than once in S1, delete the first occurrence of S2 in S1, else return S1 
	 * 4. Divide S2 into two halves and add the first half to the beginning of the S1 and second half to the end of S1.
	 * Note: If there are odd number of letters in S2, then add (n/2)+1 letters to the beginning and the remaining 
	 * letters to the end. (n is the number of letters in S2) 
	 * 5. If S1 contains characters that is in S2 change all such characters to * 
	 * Sample Input and Output :
	 * S1=”JAVAJAVA” 
	 * S2=”VA’ 
	 * 1. VAAVAAVAAVAA (J replaced with VA, V replaced with VA etc.) 
	 * 2. JAVAJAAV 
	 * 3. JAJAVA 
	 * 4. VJAVAJAVAA 
	 * 5. J***J*** 
	 * Output:{“ VAAVAAVAAVAA”,” JAVAJAAV”,” JAJAVA”,” VJAVAJAVAA“,”J***J***“}
	 */
	public static void main(String[] args) 
	{
		String S1 = "JAVAJAVA";
		String S2 = "VA";
		
		System.out.println("Output: " + stringOperation(S1, S2));
	}
	public static List<String> stringOperation(String S1, String S2) 
	{
		List<String> list = new ArrayList<String>();
		
		// 1. Character in each alternate index of S1 should be replaced with S2
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < S1.length(); i += 2) 
		{
			sb.append(S2);
			sb.append(S1.charAt(i));
		}
		list.add(sb.toString());
		
		// 2. If S2 appears more than once in S1, replace the last occurrence 
		// of S2 in S1 with the reverse of S2, else return S1+S2
		int occurrence = S1.split(S2, -1).length - 1;
		if (occurrence > 1)
			list.add(S1.substring(0, S1.lastIndexOf(S2)) + new StringBuilder(S2).reverse());
		
		// 3. If S2 appears more than once in S1, delete the first occurrence 
		// of S2 in S1, else return S1
		if (occurrence > 1)
			list.add(S1.substring(0, S1.indexOf(S2)) + S1.substring(S1.indexOf(S2) + S2.length(), S1.length()));
		
		// 4. Divide S2 into two halves and add the first half to the beginning of the S1 
		// and second half to the end of S1. 
		int partLength = S2.length() % 2 == 0 ? S2.length() / 2 : S2.length() / 2 + 1;
		list.add(S2.substring(0, partLength) + S1 + S2.substring(partLength, S2.length()));
		
		// 5. If S1 contains characters that is in S2 change all such characters to *
		sb = new StringBuilder();
		for (int i = 0; i < S1.length(); i++) 
		{
			if (S2.indexOf(S1.charAt(i)) != -1)
				sb.append('*');
			else
				sb.append(S1.charAt(i));
		}
		list.add(sb.toString());
		
		return list;
	}
}
