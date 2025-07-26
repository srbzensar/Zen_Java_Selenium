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
	
	Student()
	{
		rollNo = 1;
		course = "Java";
	}
	
	Student(int rollNo, String name, String city, String course)
	{
		this.rollNo = rollNo;
		this.name = name;
		this.city = city;
		this.course = course;
	}
	
	/*
	override the method from parent class
	@Override annotation
	not mandatory
	but recommended
	*/
//	overriding the intro method
	@Override
	public void intro()
	{
		System.out.println("Hello, I'm " + this.name + " from " + this.city + " learning " + this.course);
	}
	
	
	public static void main(String[] args) {

//		If I've parameterised constructor, then empty constructor is mandatory for below scenario
		Student s = new Student();
		
//		Student s = new Student(10, "Sachin", "Mumbai", "Java");
		System.out.println("Name: " + s.name);
		System.out.println("City: " + s.city);
		s.intro();
		
		System.out.println("RollNo: " + s.rollNo);
		System.out.println("Course: " + s.course);
		
		Student s2 = new Student(7, "Dhoni", "Ranchi", "Python");
		s2.intro();
		
		Person p = new Person("Virat", "Delhi");
		p.intro(); 
		
		
		
		
	}

}
