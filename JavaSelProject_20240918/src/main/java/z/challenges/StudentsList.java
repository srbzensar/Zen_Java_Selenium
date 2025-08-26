package z.challenges;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import c.oop.basics.b.Student;

public class StudentsList {

	public static void main(String[] args) 
	{

		Student s1 = new Student(1, "Sachin", "Mumbai");
		Student s2 = new Student(2, "Viru", "Delhi");
		Student s3 = new Student(3, "Rahul", "Bengaluru");
		Student s4 = new Student(4, "Dhoni", "Ranchi");
		Student s5 = new Student(5, "Saurav", "Kolkata");
		
		List<Student> students = new ArrayList<Student>();
		
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
