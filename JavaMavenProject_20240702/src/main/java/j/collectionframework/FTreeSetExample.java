package j.collectionframework;

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
public class FTreeSetExample {

	public static void main(String[] args) {

		TreeSet<String> hsStr = new TreeSet<String>();
		
		
		hsStr.add("Rohit");
		hsStr.add("Virat");
		hsStr.add("Rohit"); // ignored duplicate
		
		hsStr.add("Sachin");
		hsStr.add("Rahul");
		hsStr.add("Kapil");
		
		hsStr.add("null"); // string
//		hsStr.add(null); // exception
		
		
		
		System.out.println(hsStr);
	
		
	}

}
