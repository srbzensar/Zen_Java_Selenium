package l.collectionframework;

import java.util.HashSet;

/*
Set is an interface

implemented by classes
HashSet >		insertion order is not maintained	null allowed
LinkedHashSet > maintains insertion order			null allowed
TreeSet > 		sorted order						null NOT allowed

*/


public class EHashSetExample {

	public static void main(String[] args) {

		HashSet hs = new HashSet();
				
		hs.add(10);
		hs.add(20);
		hs.add(15);
		hs.add("Sachin");
		hs.add(3.14);
		hs.add(10); // ignore the duplicate value
		
		System.out.println(hs);
		
		
		HashSet<String> hsStr = new HashSet<String>();
		
//		hsStr.add(10); // not allowed
		hsStr.add("Sachin");
//		hsStr.add(3.14); // not allowed
		hsStr.add("Rohit");
		hsStr.add("Virat");
		hsStr.add("Rohit");
		hsStr.add(null);
		
//		System.out.println(hs);
		System.out.println(hsStr);
	}

}
