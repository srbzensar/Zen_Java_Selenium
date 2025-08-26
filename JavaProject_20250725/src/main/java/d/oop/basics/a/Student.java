package d.oop.basics.a;

public class Student {

//	instance properties/ instance variable
	int rollNo;
	String name;
	String city;

//	class level/ static properties
	static String collegeName = "Pune University";
	
//	empty constructor (if not defined, default constructor will be called)
//	name is same as class
//	get called automatically during object creation
//	If we create even one constructor, default constructor will not get called.
	public Student()
	{
//		rollNo = 10;
//		or
		this.rollNo = 10;
		name = "Sachin";
		city = "Mumbai";
	}
	
	
	
	public static void main(String[] args) 
	{
		int i = 10;  // local variable
		
//		class						class
		Student s1		 		= 	new Student();
//		s1 is reference var			new object of the class
		
		Student s2 = new Student();
		
		
		
		
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


//public class Student {
//
////	instance properties/ instance variable
//	int rollNo;
//	String name;
//	String city;
//
//	
////	class level/ static properties
//	static String collegeName = "Pune University";
//	
//	
//	public static void main(String[] args) 
//	{
//		int i = 10;  // local variable
//		
////		class						class
//		Student s1		 		= 	new Student();
////		s1 is reference var			new object of the class
//		
////		accessing instance property using object name
//		System.out.println(s1.rollNo);
//		System.out.println(s1.name);
//		System.out.println(s1.city);
//		
//		
////		accessing static property using class name
//		System.out.println(Student.collegeName); // static way
//		System.out.println(collegeName);
////		System.out.println(s1.collegeName); // not a static way: not recommended
//	}
//}