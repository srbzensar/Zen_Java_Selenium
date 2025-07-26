package l.collectionframework;

import java.util.HashMap;

public class IMapMethods {

	public static void main(String[] args) {
		HashMap <Integer,String>hm = new HashMap<>();
		
		hm.put(3, "C");
		hm.put(2, "A");
		hm.put(2, "D");
		hm.put(5, "C");
		hm.put(7, "D");
		hm.put(8, "Y");
		
		System.out.println(hm);
		
		System.out.println(hm.get(3));
		
		System.out.println(hm.keySet());
		
		if(hm.keySet().contains(10))
			System.out.println(hm.get(10));
		
		if(hm.keySet().contains(7))
			System.out.println(hm.get(7));
		
		if(hm.containsKey(7))
			System.out.println(hm.get(7));
		
		
		System.out.println(hm.values());
		
		if(hm.values().contains("D"))
			System.out.println("Value D is available");
		
		System.out.println(hm.size());
		
	}

}
