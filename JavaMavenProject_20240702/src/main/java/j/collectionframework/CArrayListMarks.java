package j.collectionframework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CArrayListMarks {

	public static void main(String[] args) {

//		List al = new ArrayList();
//		List al2 = new ArrayList();
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList al2 = new ArrayList();
		ArrayList al3 = new ArrayList();
		
		for(int i=0;i<5;i++)
		{
			al.add((i+1)*10);
		}
		
		System.out.println(al);
		System.out.println(al.size());
		
		al.sort(null);
		System.out.println(al);
		
		al.sort(Comparator.reverseOrder());
		System.out.println(al);

		System.out.println(al.contains(30));
		
////		al2 = al.clone();
//		System.out.println(al.clone());
		
//		al.clear();
		
//		al.remove(1);
		
//		System.out.println(al);
		
		al3.add(800);
		al3.add(900);
		System.out.println(al3); 
		
//		al.add(al3); // [50, 40, 30, 20, 10, [800, 900]]
//		System.out.println(al);
		
		al.addAll(al3);
		// [50, 40, 30, 20, 10, 800, 900]
		System.out.println(al);
		
		/*
		 * ArrayList iterator
		Iterator: useful to traverse
		Iterator<Integer> it = al.iterator();
		it.hasNext()	check the presence of next element
		it.next()		access the element
		
		*/
		Iterator<Integer> it = al.iterator();
		System.out.println("print arraylist using iterator");
		
		while(it.hasNext())
			System.out.print(it.next() + " ");
		System.out.println("-------");
		
//		--------------------
//		while(it.hasNext())
//			System.out.print(it.next() + " ");
//		System.out.println();
		
//		--------------------
//		no previous option
		
//		-------------------------------------
//		List iterator: specific to List
		
		ListIterator<Integer> ltr = al.listIterator();
		
		System.out.println("Forward direction");
		while(ltr.hasNext())
			System.out.print(ltr.next() + " ");
		System.out.println();
		
		System.out.println("Reverse direction");
		while(ltr.hasPrevious())
			System.out.print(ltr.previous() + " ");
		System.out.println();
	}

}
