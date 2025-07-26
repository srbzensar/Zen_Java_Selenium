package j.collectionframework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/*
Map is Interface
implemented by classes
HashMap		insertion order not maintained		null allowed in key
LinkedHashMap	insertion order maintained		null allowed in key
TreeMap		sored order on key, null not allowed in key, null allowed for value

*/
public class GMap {

	public static void main(String[] args) {
//		HashMap<Integer, String> hm = new HashMap<Integer, String>();
//		
//		hm.put(3,  "C");
//		hm.put(2,  "A");
//		hm.put(1,  "C");
//		hm.put(3,  "E"); // overwrite
//		hm.put(null,  "T");
//		hm.put(7,  "D");
//		hm.put(6,  "Y");
//		
//		System.out.println(hm);
		
		
//		LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();
//		
//		hm.put(3,  "C");
//		hm.put(2,  "A");
//		hm.put(1,  "C");
//		hm.put(3,  "E"); // overwrite
//		hm.put(null,  "T");
//		hm.put(7,  "D");
//		hm.put(6,  "Y");
//		
//		System.out.println(hm);
		
		TreeMap<Integer, String> hm = new TreeMap<Integer, String>();
		
		
		hm.put(3,  "C");
		hm.put(2,  "A");
		hm.put(1,  "C");
		hm.put(3,  "E"); // overwrite
//		hm.put(null,  "T");  // exception
		hm.put(7,  "D");
		hm.put(6,  "Y");
		
		System.out.println(hm);
		
		System.out.println(hm.get(3));
		System.out.println(hm.navigableKeySet());
		
		for(Integer k:hm.navigableKeySet())
		{
			System.out.println(hm.get(k));
		}
		
	}

}
