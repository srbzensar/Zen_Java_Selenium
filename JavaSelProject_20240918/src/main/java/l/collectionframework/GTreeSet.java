package l.collectionframework;

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


public class GTreeSet {

	public static void main(String[] args) {

		TreeSet<String> hsStr = new TreeSet<String>();
		
		hsStr.add("Sachin");
		hsStr.add("Rohit");
		hsStr.add("Virat");
		hsStr.add("Rohit");
//		hsStr.add(null); // not allowed
		
		System.out.println(hsStr);
	}

}
