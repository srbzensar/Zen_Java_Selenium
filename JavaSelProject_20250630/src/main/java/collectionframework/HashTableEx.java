package collectionframework;

import java.util.Hashtable;

/*
null is not allowed in key or value
*/
public class HashTableEx {

	
	public static void main(String[] args) {
		
		Hashtable<String, Integer> hT = new Hashtable<>();
		hT.put("Sachin", 150);
		hT.put("Rahul", 140);
		hT.put("Dhoni", 180);
		hT.put("Pant", 100);
		hT.put("Rohit", 130);
		hT.put("Virat", 170);
//		hT.put("Jadeja", null);
//		hT.put(null, null);
//		hT.put(null, 170);
		
		
		System.out.println(hT);
		
	}

}
