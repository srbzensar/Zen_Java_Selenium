package l.collectionframework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class JMapNavigation {

	public static void main(String[] args) {
	HashMap <String, Integer>hm = new HashMap<>();
		
		hm.put("Sachin", 150);
		hm.put("Rahul", 140);
		hm.put("Dhoni", 180);
		hm.put("Pant", 100);
		hm.put("Rohit", 130);
		hm.put("Virat", 170);
		
		System.out.println("------------ Map -----------------");
		System.out.println(hm);
		
		System.out.println("------------ for keys -----------");
		for(String k :hm.keySet())
			System.out.println(k + " : " + hm.get(k));
		
		System.out.println("---------- for entrySet-------------");
		for(Entry<String, Integer> e :hm.entrySet())
			System.out.println(e);
		
		System.out.println("--------variaton -------------------");
		for(Entry<String, Integer> e :hm.entrySet())
			System.out.println(e.getKey() + " : " + e.getValue());
		

		System.out.println("-------- Lambda Expression -----------");
		hm.forEach((k, v) -> {
			System.out.println(k + ": " + v);
		});
		
				
		System.out.println("-------Iterator----------------------");
		Iterator<Entry<String, Integer>> iterator = hm.entrySet().iterator();
			
		while (iterator.hasNext()) {
		    Map.Entry<String, Integer> entry = iterator.next();
		    System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}
		System.out.println("-----------------------------");
		
//		Lambda expression

		List<String> players = Arrays.asList("Sunil", "Ravi", "Kapil");
		System.out.println(players);
		
		players.forEach(player -> System.out.println("Hello " + player));
		System.out.println("-----------------------------");
		
	}

}
