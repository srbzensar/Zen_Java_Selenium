package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorEx {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>();
		for(int i=0; i<5; i++)
		{
			al.add((i+1)*10);
		}
		System.out.println(al);
		System.out.println("-----------------");
		/*
		 * Iterator<Integer> it = al.iterator(); 
		 * it.hasNext() check the presence of next
		 * element it.next() access the element
		 */
		Iterator<Integer> it = al.iterator();
		System.out.println("print ArrayList using iterator");
		while(it.hasNext())
		{
			System.out.print(it.next() + " ");
		}
		System.out.println("\n-----------------");
		
		System.out.println("print ArrayList again using iterator");
		while(it.hasNext())
		{
			System.out.print(it.next() + " ");
		}
		System.out.println("\n-----------------");
		
//		-------------------------------------
//		List Iterator: specific to List
		ListIterator<Integer> ltr = al.listIterator();
		
		System.out.println("forward direction");
		while(ltr.hasNext())
		{
			System.out.print(ltr.next() + " ");
		}
		System.out.println("\n-----------------");
		
		System.out.println("reverse direction");
		while(ltr.hasPrevious())
		{
			System.out.print(ltr.previous() + " ");
		}
		System.out.println("\n-----------------");
		
		
	}
}
