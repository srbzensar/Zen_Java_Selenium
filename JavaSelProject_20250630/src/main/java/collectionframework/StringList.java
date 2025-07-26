package collectionframework;

import java.util.ArrayList;
import java.util.List;

public class StringList {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		
		
		list.add("Sachin");
		list.add("Saurav");
		
//		list.add(100); // not possible to add other datatypes.
//		list.add(null);
		list.add("Pant");
		list.add("Jadeja");
		list.add("Rahul");
		
		
		System.out.println(list);
		
		
		
//		-------------------------------------
		
		for(int i=0; i<list.size(); i++)
		{
			System.out.print(list.get(i) + " ");
			System.out.println(list.get(i).toUpperCase());
		}
		
		System.out.println();
		
		for(String s:list)
		{
			System.out.print(s + " ");
		}
		
//		-----------------------------
		
//		list.add(20); not allowed
		
		list.add("Rohit");
		
		list.add(2, "Kumble");
		
		list.remove(1);
//		list.clear();		
		
		System.out.println(list);
		
		
		System.out.println(list.contains("Rohit"));
		
		System.out.println(list.isEmpty());
		
//		--------------------------------------
		
		ArrayList<String> list2 = list;
		
		System.out.println(list2);
		list2.remove(1);
		System.out.println(list2);
		
		System.out.println(list.equals(list2)); // t
		System.out.println(list);
		
		ArrayList<String> list3 = new ArrayList<String>();
		
		list.add("Sachin");
		list.add("Saurav");
		list.add("Rahul");
		
		System.out.println(list.equals(list3)); // f
		
		
	}
	

}
