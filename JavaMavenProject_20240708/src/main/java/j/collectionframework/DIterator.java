package j.collectionframework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DIterator {

	public static void main(String[] args) {

//		ArrayList<Integer> al = new ArrayList<Integer>();
//		List<Integer> al = new ArrayList<Integer>();
		List al = new ArrayList();
		
		for(int i=0;i<5;i++)
		{
			al.add((i+1)*10);
		}
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
		{
			System.out.print(it.next() + " ");
		}
		System.out.println("\n-----------------");
		
		
////		----------------------
//		while(it.hasNext())
//		{
//			System.out.print(it.next() + " ");
//		}
//		System.out.println("\n-----------------");
//		no previous option
////		----------------------
		
	
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
