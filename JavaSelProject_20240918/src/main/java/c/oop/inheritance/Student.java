package c.oop.inheritance;

/*
Object class is a parent class for all classes, by default
-------------------------------

Super class			Parent class			base class

sub class			child class			derived class
*/

public class Student extends Person {
	
	int rollNo;
	String course;
	
	public Student()
	{
		super(); 
		rollNo = 1;
		course = "Java";
	}

	public Student(int rollNo, String name, String city, String course) 
	{
		super(name, city);
		this.rollNo = rollNo;
		this.course = course;
	}
	
	public static void takeExam()
	{
		System.out.println("This is exam time!");
	}

	public static void main(String[] args) {
		Student s = new Student();
		
//		System.out.println(s.name);
//		System.out.println(s.city);
		s.intro();
		
		Student s2 = new Student(7, "Dhoni", "Ranchi", "Python");
		s2.intro();
	}
}
