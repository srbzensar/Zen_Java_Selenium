package c.oop.inheritance;

/*
Object class is a parent class for all classes, by default
-------------------------------

Super class			Parent class			base class

sub class			child class			derived class
*/

public class Student extends Person {

	int rollNo=1;
	String course = "Java";
	
//	Student()
//	{
//		
//	}
	
	
	Student(int rollNo)
	{
		this.rollNo = rollNo;
	}
	
	
	public Student(int rollNo, String name, String city) {
		super(name, city);  // must be the first statement here
		this.rollNo = rollNo;
	}
	
	/*
	override the method from parent class
	@Override annotation
	not mandatory
	but recommended
	*/
	@Override
	public void intro()
	{
		System.out.println("Hello, I'm " + name + " from " + city + " learning " + course);
//		return("Hello, I'm " + name + " from " + city + " learning " + course);
	}


	public static void main(String[] args) {

//		If I've parameterised constructor, then empty constructor is mandatory for below scenario
//		Student s = new Student();
		
		Student s = new Student(10);
		System.out.println("RollNo: " + s.rollNo);
		System.out.println("Name: " + s.name);
		System.out.println("City: " + s.city);
		s.intro();
		
		Student s2 = new Student(7, "Dhoni", "Ranchi");
		s2.intro();
		
		
	}

}
