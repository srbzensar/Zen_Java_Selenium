package j.collectionframework;

import java.util.LinkedHashMap;

public class HCountCharInString {

	public static void main(String[] args) {

		String s = "Sachin Tendulkar India";
		
		LinkedHashMap<Character, Integer> hm = new LinkedHashMap<Character, Integer>();
		char ar[] = s.toCharArray();
		
		for(char c:ar)
		{
			if(hm.containsKey(c))
			{
				hm.put(c, hm.get(c) + 1);
			}
			else
			{
				hm.put(c, 1);
			}
		}
		System.out.println(hm);
		
	}

}
