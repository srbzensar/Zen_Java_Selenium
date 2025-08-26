package d.oop.basics.b;

public class Student {

//	instance properties/ instance variable
	int rollNo;
	String name;
	String city;

//	class level/ static properties
	static String collegeName = "Pune University";
	
//	empty constructor
	public Student()
	{
		this.rollNo = 10;
		name = "Sachin";
		city = "Mumbai";
	}
	
//	parameterized constructor
	public Student(int rollNo, String name, String city) 
	{
		this.rollNo = rollNo;
		this.name = name;
		this.city = city;
	}

	public static void main(String[] args) 
	{
//		Student s1 = new Student();
		Student s1 = new Student(10, "Sachin", "Mumbai");
		Student s2 = new Student(11, "Rahul", "Bengaluru");
		
//		accessing instance property using object name
		System.out.println(s1.rollNo);
		System.out.println(s1.name);
		System.out.println(s1.city);
		System.out.println("-----------------------------------");
		System.out.println(s2.rollNo);
		System.out.println(s2.name);
		System.out.println(s2.city);
		System.out.println("-----------------------------------");		
//		accessing static property using class name
		System.out.println(Student.collegeName); // static way
//		System.out.println(collegeName);
//		System.out.println(s1.collegeName); // not a static way: not recommended
	}
}
