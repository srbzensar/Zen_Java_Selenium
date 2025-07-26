package l.collectionframework;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*
Set is an interface

implemented by classes
HashSet >		insertion order is not maintained	null allowed
LinkedHashSet > maintains insertion order			null allowed
TreeSet > 		sorted order						null NOT allowed

*/


public class FLinkedHashSet {

	public static void main(String[] args) {

		LinkedHashSet<String> hsStr = new LinkedHashSet<String>();
		
		hsStr.add("Sachin");
		hsStr.add("Rohit");
		hsStr.add("Virat");
		hsStr.add("Rohit");
		hsStr.add(null);
		
		System.out.println(hsStr);
	}

}
