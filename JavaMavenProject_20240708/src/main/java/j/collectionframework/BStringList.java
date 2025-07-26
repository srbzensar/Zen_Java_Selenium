package j.collectionframework;

import java.util.ArrayList;

public class BStringList {

	public static void main(String[] args) 
	{

		ArrayList<String> list = new ArrayList<String>(); 
		
		list.add("Sachin");
		
		list.add("Saurav");
		list.add("Rohit");
		list.add("Rahul");
		list.add("Dhoni");
		
		System.out.println(list);
		
		for(int i=0;i<list.size();i++)
			System.out.print(list.get(i) + " ");
		
		System.out.println();
		
		for(String name:list)
			System.out.print(name + " ");
		
//		list.add(50);
		
		list.add("Pant"); // at last
		
		list.add(2, "Kumble"); // particular index
		
		System.out.println(list);
//		list.clear();
		list.remove(4); // particular index
		
		System.out.println(list.contains("Rohit"));

//		list.clear();
//		System.out.println(list.isEmpty());
		
		
		ArrayList<String> list2 = list; 
		
		System.out.println(list2);
		list2.remove(1);
		System.out.println(list2);
		System.out.println(list.equals(list2));
		
		
		System.out.println(list);
		
		ArrayList<String> list3 = new ArrayList<String>(); 
		
		list.add("Sachin");
		list.add("Saurav");
		list.add("Rohit");

		System.out.println(list.equals(list3));
		
		
		
	}

}
