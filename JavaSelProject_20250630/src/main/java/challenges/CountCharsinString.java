package challenges;

import java.util.LinkedHashMap;

public class CountCharsinString {

	public static void main(String[] args) {
		String s = "Sachin Tendulkar India";
		
		LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();
		
		char ar[] = s.toCharArray();
		
		for(char c:ar)
		{
			if(hm.containsKey(c))
				hm.put(c, hm.get(c) + 1); 
			else
				hm.put(c, 1);
		}
		System.out.println(hm);
		
	}

}
