package collectionframework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/*
Set is an interface

implemented by classes
HashSet >		insertion order is not maintained	null allowed
LinkedHashSet > maintains insertion order			null allowed
TreeSet > 		sorted order						null NOT allowed

*/


public class SetExamples {

	public static void main(String[] args) {

//		HashSet hs = new HashSet();
//		
//		hs.add(10);
//		hs.add(30);
//		hs.add(20);
//		hs.add("Sachin");
//		hs.add(3.14);
//		hs.add(10); // ignore the duplicate value
//		
//		System.out.println(hs);
		
//		challenge: make changes to the code to store only Integer values in the HashSet
		
//		HashSet<Integer> hs = new HashSet<>();
//		
//		hs.add(10);
//		hs.add(30);
//		hs.add(20);
//		hs.add(10); // ignore the duplicate value	
//		hs.add(null); 
//		System.out.println(hs);
		
		
//		LinkedHashSet<Integer> hs = new LinkedHashSet<>();
//		
//		hs.add(10);
//		hs.add(30);
//		hs.add(20);
//		hs.add(10); // ignore the duplicate value	
//		hs.add(null); 	
//		
//		System.out.println(hs);
		
		TreeSet<Integer> hs = new TreeSet<>();
		
		hs.add(10);
		hs.add(30);
		hs.add(20);
		hs.add(10); // ignore the duplicate value	
//		hs.add(null); 	// null is not allowed
		
		System.out.println(hs);
		
		
	}

}
