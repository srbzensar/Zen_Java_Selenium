package j.collectionframework;

import java.util.HashSet;

/*
 * contains distinct values
 * does not remember insertion order
 * 
Set is an interface

implemented by classes
HashSet >		insertion order is not maintained	null allowed
LinkedHashSet > maintains insertion order			null allowed
TreeSet > 		sorted order						null NOT allowed

*/
public class ESetExample {

	public static void main(String[] args) {

		HashSet hs = new HashSet(); 
		HashSet<String> hsStr = new HashSet<String>();
		
		hs.add(10);
		hs.add(20);
		hs.add(15);
		hs.add(90);
		hs.add("Sachin");
		hs.add(3.14);
		
		
		hsStr.add("Rohit");
		hsStr.add("Virat");
//		hsStr.add(7); // Not allowed
//		hsStr.add(true); // Not allowed
		hsStr.add("Rohit");
		hsStr.add("Sachin");
		hsStr.add("Kapil");
		
		
		System.out.println(hs); 
		System.out.println(hsStr);
////		hs.add(hsStr);
//		System.out.println(hs.add(hsStr)); 
////		System.out.println(hs.addAll(hsStr)); 
//		System.out.println(hs); 
////		
//		System.out.println(hs.isEmpty());
//		hs.remove(hsStr);
//		System.out.println(hs);
//		System.out.println(hs.clone());
//		System.out.println(hs.hashCode());
//		System.out.println(hs.size());
//		
//		HashSet<Integer> hs12 = new HashSet<Integer>();
////		HashSet<int> hs12 = new HashSet<int>();
		
		
		
		
		
	}

}
