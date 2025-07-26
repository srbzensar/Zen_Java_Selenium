package collectionframework;

import java.util.ArrayList;
import java.util.List;

public class SimpleList {

	public static void main(String[] args) {

//		Circle c = new Circle();
//		Shape c = new Circle();
		
		
//		ArrayList list = new ArrayList();
		List list = new ArrayList();
		
		list.add("Sachin");
		list.add("Saurav");
		
		System.out.println(list);
		
		list.add(100);
		int a = 50;
		list.add(a);
		
		list.add(3.14);
		list.add(true);
		list.add(null);
		list.add("Pant");
		list.add("Jadeja");
		
		
		System.out.println(list);
		
		
		
//		-------------------------------------
		
		for(int i=0; i<list.size(); i++)
		{
			System.out.print(list.get(i) + " ");
//			System.out.println(list.get(i).toUpperCase());
//			possible to make it type-safe? yes, using generics
		}
		
		System.out.println();
		
		for(Object o:list)
		{
			System.out.print(o + " ");
		}
		
	}

}
