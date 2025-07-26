package l.collectionframework;

import java.util.ArrayList;
import java.util.List;

public class BStringList {

	public static void main(String[] args) {

		
		List<String> list = new ArrayList<String>();
		
		list.add("Sachin");
		list.add("Saurav");
		list.add("Rahul");
		list.add("Rohit");
//		list.add(true); // not allowed
		
		
		System.out.println(list);
		
		for(int i=0; i<list.size(); i++)
		{
			System.out.print(list.get(i) + " ");
//			System.out.print(list.get(i).toUpperCase() + " ");
			
		}
		System.out.println();
		
		for(String name:list)
			System.out.print(name + " ");
		
//		------------------------------
//		list.add(100); // not allowed
		
		System.out.println();
		list.add(2, "Pant"); // particular index 
		System.out.println(list);
		
//		list.clear();
//		System.out.println(list.isEmpty());
		
		list.remove(3);
		list.remove("Rohit");
		
		System.out.println(list.contains("Rohit"));
		
		if(!list.isEmpty())
			System.out.println(list);
		
//		------------------------------
		
		List<String> list2 = list;
		
		System.out.println(list2);
		System.out.println(list.equals(list2)); // true
		
		list.remove(2);
		System.out.println(list.equals(list2)); // true
		System.out.println(list2);
//		----------------
		
		List<String> list3 = new ArrayList<String>(); 
		
		list3.add("Sachin");
		list3.add("Saurav");
		list3.add("Rohit");

		System.out.println(list.equals(list3));
	}

}
