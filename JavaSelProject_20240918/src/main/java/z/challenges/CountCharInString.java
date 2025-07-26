package z.challenges;

import java.util.LinkedHashMap;

public class CountCharInString {

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

/*
S: 1,	
a: 1,
c: 1,
h: 1,
i: 1,
n: 2,
T: 1,
e: 1,


*/


