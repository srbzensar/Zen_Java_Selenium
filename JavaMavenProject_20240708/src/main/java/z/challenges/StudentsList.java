package z.challenges;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import c.oop.basics.BStudent;

public class StudentsList {

	public static void main(String[] args) 
	{

		BStudent s1 = new BStudent(1, "Sachin", "Mumbai");
		BStudent s2 = new BStudent(2, "Viru", "Delhi");
		BStudent s3 = new BStudent(3, "Rahul", "Bengaluru");
		BStudent s4 = new BStudent(4, "Dhoni", "Ranchi");
		BStudent s5 = new BStudent(5, "Saurav", "Kolkata");
		
		List<BStudent> students = new ArrayList<BStudent>();
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		
//		students.get(1).show();
		
//		for(int i=0; i<students.size(); i++)
//		{
//			students.get(i).show();
//		}
		
//		for(BStudent s: students)
//			s.show();
		
//		Iterator<BStudent> it = students.iterator();
//		while(it.hasNext())
//		{
//			it.next().show();
//		}
		
	}

}
