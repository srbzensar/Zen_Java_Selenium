package collectionframework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayListMarks {

	public static void main(String[] args) {

		List al = new ArrayList<Integer>();
		
		for(int i=0;i<5; i++)
			al.add((i+1)*10);
		
		System.out.println(al);
		
		System.out.println(al.size());
		
		al.sort(Comparator.reverseOrder());
		System.out.println(al);

		al.sort(null); // sort
		System.out.println(al);
				
//		---------------------
		System.out.println(al.contains(30));
		
		System.out.println(al);
		al.set(2, 90);
		System.out.println(al);
		
		al.set(al.indexOf(50), 20);
		System.out.println(al);
		
		System.out.println(al.indexOf(20)); // 1 
		System.out.println(al.lastIndexOf(20));// 4
		
//		---------------------------
		
		List<Integer> al2 = new ArrayList<Integer>();
		
		al2.add(800);
		al2.add(900);
		System.out.println(al2);
		
		al2.add(1000); 
		System.out.println(al2);
		
		al.add(al2);		
		al.add(60);
		System.out.println(al);
		
//		al.addAll(al2);		
//		System.out.println(al);
		
//		-------------------------
//		print inner list 
		System.out.println(al.get(5));
		
//		challenge: print value 800 from al
		System.out.println(((ArrayList)al.get(5)).get(0));
		
	}

}
