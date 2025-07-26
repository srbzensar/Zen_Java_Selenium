package collectionframework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/*
 * Map interface: key value pair
 * keys: unique

Map is Interface
implemented by classes
HashMap			insertion order not maintained		null allowed in key
LinkedHashMap	insertion order maintained			null allowed in key
TreeMap			sored order on key, null not allowed in key, null allowed for value

*/


public class HMapExamples {

	public static void main(String[] args) {
//		HashMap hm = new HashMap();
//		
//		hm.put(3, "C");
//		hm.put(2, "A");
//		hm.put("mobile", 555);
//		hm.put(2, "D");
//		hm.put("resi", "020-45626345");
//		
//		System.out.println(hm);
		
//		----------------------------------------------------
//		key must be Integer and value must be String
		
//		HashMap hm = new HashMap();
//		
//		hm.put(3, "C");
//		hm.put(2, "A");
//		hm.put("mobile", 555);
//		hm.put(2, "D");
//		hm.put("resi", "020-45626345");
//		
//		System.out.println(hm);
		
//		HashMap <Integer,String>hm = new HashMap<>();
//		
//		hm.put(3, "C");
//		hm.put(2, "A");
////		hm.put("mobile", 555);
//		hm.put(2, "D");
////		hm.put("resi", "020-45626345");
//		hm.put(5, "C");
//		hm.put(null, "T");
//		hm.put(7, "D");
//		hm.put(8, "Y");
//		
//		System.out.println(hm);
		
////		---------------------------------
//		
//		LinkedHashMap <Integer,String>hm = new LinkedHashMap<>();
//		
//		hm.put(3, "C");
//		hm.put(2, "A");
////		hm.put("mobile", 555);
//		hm.put(2, "D");
////		hm.put("resi", "020-45626345");
//		hm.put(5, "C");
//		hm.put(null, "T");
//		hm.put(7, "D");
//		hm.put(8, "Y");
//		
//		System.out.println(hm);
//		
//		---------------------------------
		
		TreeMap <Integer,String>hm = new TreeMap<>();
		
		hm.put(3, "C");
		hm.put(2, "A");
//		hm.put("mobile", 555);
		hm.put(2, "D");
//		hm.put("resi", "020-45626345");
		hm.put(5, "C");
//		hm.put(null, "T"); // not not allowed
		hm.put(7, "D");
		hm.put(8, "Y");
		
		System.out.println(hm);
		
	}

}
