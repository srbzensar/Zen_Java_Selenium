package l.collectionframework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CMarksList {

	public static void main(String[] args) {

		
//		List<Integer> list = new ArrayList<Integer>();
//		
//		
//		for(int i=0; i<5; i++)
//		{
//			list.add((i+1)*10);
//		}
//		System.out.println(list);
//		System.out.println(list.size());
//		
//		list.sort(Comparator.reverseOrder());
//		System.out.println(list);
//		
//		list.sort(null);
//		System.out.println(list);
		
//		System.out.println(list.contains(30));
//		
//		System.out.println(list);
//		list.set(2, 90);
//		System.out.println(list);
//		
//		list.set(list.indexOf(50), 20);
//		System.out.println(list);
//		
//		System.out.println(list.indexOf(20)); // 1 
//		System.out.println(list.lastIndexOf(20));// 4
		
		
//		List<Integer> al = new ArrayList<Integer>();
//		al.add(800);
//		al.add(900);
//		System.out.println(al);
//		
//		list.add(25);
//		System.out.println(list);
//	
//		list.addAll(al);
//		System.out.println(list);
		
//		---------------------------------------------------
		List list = new ArrayList();
		
		
		for(int i=0; i<5; i++)
		{
			list.add((i+1)*10);
		}
		System.out.println(list);
		System.out.println(list.size());
		
		list.sort(Comparator.reverseOrder());
		System.out.println(list);
		
		list.sort(null);
		System.out.println(list);
		
		List al = new ArrayList();
		al.add(800);
		al.add(900);
		System.out.println(al);
		
		list.add(25);
		System.out.println(list);
	
		Integer a = 30;
		list.remove(a);
		
		list.add(al);
		System.out.println(list);
		
//		System.out.println(list.get(6));
//		System.out.println(((ArrayList)list.get(6)).get(0));
		
	}

}
