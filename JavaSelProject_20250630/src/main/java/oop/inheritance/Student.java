package oop.inheritance;

public class Student extends Person{
	
	int rollNo;
	String course;
	
	
	Student()
	{
		super(); // empty constructor from parent gets called automatically
//		super("Rahul", "Bengaluru");
//		** if we call, it must be the first statement of my constructor

		rollNo = 1;
		course = "Java";
//		
	}
	
	Student(int rollNo, String name, String city, String course)
	{
		super(name, city); // calling parent class constructor
//		parameterised constructor from parent to be called explicitly
		this.rollNo = rollNo;
		this.course = course;
	}

////	overriding the method of parent class
	public void intro()
	{
		System.out.println("Hey, I'm " + name + " from " + city + " learning " + course); 
	}
	
	
	public void show()
	{
		System.out.println("show of student");
	}
	
	public static void main(String[] args) {

		Student s = new Student();
		
		System.out.println("RollNo " + s.rollNo);  
		System.out.println("Name " + s.name);
		System.out.println("City " + s.city);
		System.out.println("Course " + s.course);
		
		s.intro();
		
		Student s2 = new Student(7, "Dhoni", "Ranchi", "Python");
		s2.intro();
		System.out.println("Course " + s2.course);
		
//		Calling Sequence: CP
//		Execution Sequence: PC
		
		Person s3 = new Person();
		s3.intro();
		
//		
	}

}
