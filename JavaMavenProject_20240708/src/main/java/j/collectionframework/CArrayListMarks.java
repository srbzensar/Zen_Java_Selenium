package j.collectionframework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CArrayListMarks {

	public static void main(String[] args) {

//		ArrayList<Integer> al = new ArrayList<Integer>();
//		List<Integer> al = new ArrayList<Integer>();
		List al = new ArrayList();
		
		for(int i=0;i<5;i++)
		{
			al.add((i+1)*10);
		}
		System.out.println(al);
		System.out.println(al.size());
		
		al.sort(Comparator.reverseOrder());
		System.out.println(al);
				
		al.sort(null);
		System.out.println(al);
		
		System.out.println(al.contains(30));
		
//		ArrayList<Integer> al2 = (ArrayList) al.clone();
//		System.out.println(al2);
		
		
		List al3 = new ArrayList();
		al3.add(800);
		al3.add(900);
		System.out.println(al3);
		
		al.add(25);
		System.out.println(al);
		
		al.add(al3);
		System.out.println(al);  // [10, 20, 30, 40, 50, 25, [800, 900]]

		System.out.println(al.get(6));
		System.out.println(((ArrayList)al.get(6)).get(0));
		
//		al.addAll(al3);
//		System.out.println(al);  // [10, 20, 30, 40, 50, 25, 800, 900]
		
		
		
	}

}
