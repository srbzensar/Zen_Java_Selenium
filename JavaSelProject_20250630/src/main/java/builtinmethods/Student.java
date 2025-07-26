package builtinmethods;

public class Student {
//	instance properties
	int rollNo;
	String name;
	String city;
	
//	constructor: parameterised
	public Student(int rollNo, String name, String city) 
	{
		this.rollNo = rollNo; 
		this.name = name;
		this.city = city;
	}

	public String toString() // gets called automatically
	{
//		return "Hello";
		return rollNo + " " + name + " " + city;
	}

	public boolean equals(Object obj)
	{
		Student s = (Student)obj;
		return (this.rollNo == s.rollNo && this.name.equals(s.name) && this.city.equals(s.city));
	}
	
	
	
	public static void main(String[] args) {
		
		int i=1; // local variable (must be initialized)
		System.out.println(i);
		
		Student s1 = new Student(10, "Sachin", "Mumbai");
		Student s2 = new Student(2, "Rahul", "Bengaluru");
		Student s3 = new Student(10, "Sachin", "Mumbai");
		Student s4 = s1;
		
		System.out.println(s1); // by default prints reference
		// we can override toString() to print meaningful values.
		System.out.println(s2);
		
//		String str1 = "Sachin";
//		String str2 = "Sachin";
//		
//		System.out.println(str1.equals(str2));
		
//		by default it compares the references of the objects.
//		we can override equals method to compare the properties of 2 objects.
		System.out.println(s1.equals(s1)); // true
		System.out.println(s1.equals(s2)); // false
		System.out.println(s1.equals(s4)); // true
		System.out.println(s1.equals(s3)); // true
	}
}
