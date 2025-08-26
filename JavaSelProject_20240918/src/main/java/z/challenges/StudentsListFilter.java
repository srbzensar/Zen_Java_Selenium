package z.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import z.challenges.ref.Student;


public class StudentsListFilter {

	public static void main(String[] args) 
	{

        List<Student> students = Arrays.asList(
			new Student(1, "Sachin", "Mumbai", 32),
			new Student(2, "Viru", "Delhi", 37),
			new Student(3, "Rahul", "Bengaluru", 42),
			new Student(4, "Dhoni", "Ranchi", 24),
			new Student(5, "Saurav", "Kolkata", 34)
        		);


        List<Student> filteredSorted = students.stream()
                   .filter(s -> s.getAge() > 25)
                   .sorted(Comparator.comparing(Student::getName))
                   .collect(Collectors.toList());

        filteredSorted.forEach(System.out::println);
           
//        This is a Java 8+ functional programming style that uses:
//
//        	* forEach Method
//        	It's a method from the Iterable interface (like List, Set, etc.).
//        	It loops through each element in the collection and performs an action.

//        	*System.out::println (Method Reference)
//        	This is a method reference to System.out.println().
//        	It’s a shorthand for writing a lambda like:
//        student -> System.out.println(student)

        for (Student s : filteredSorted) {
            System.out.println(s);
        }

        
        
	}

}
