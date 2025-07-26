package oop.basics.b;

public class Student {
//	instance properties
	int rollNo;
	String name;
	String city;
	
//	class level/ static property
	static String collegeName = "Pune University";
	
	
//	default constructor: if we don't define even a single contructor, 
//	default constructor will be called.
	
//	constructor: empty
	public Student()
	{
		rollNo = 10;
		name = "Sachin";
		city = "Mumbai";
	}
	
//	constructor: parameterised
	public Student(int rollNo, String name, String city) 
	{
		this.rollNo = rollNo; 
		this.name = name;
		this.city = city;
	}

//	instance methods
	public int getRollNo()
	{
		return this.rollNo; // this keyword refers to the object who has called the method
//		return rollNo;
	}
	
	public void setRollNo(int roll)
	{
//		this.rollNo = roll;
		rollNo = roll;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
//	instance methods
	public void changeRoll()
	{
		this.rollNo += 100;  
	}
	
	public void intro()
	{
		System.out.println("Hello, I am " + this.name + " from " + this.city);
	}
	

//	Getters and setters for static property
	public static String getCollegeName() {
		return collegeName;
	}

	public static void setCollegeName(String collegeName) {
		Student.collegeName = collegeName;
	}
	
	public static void displayHoliday()
	{
		System.out.println("Tomorrow is holiday");
	}
	
	public static void main(String[] args) {
		
		int i=1; // local variable (must be initialized)
		System.out.println(i);
		
		Student s1 = new Student();
		Student s2 = new Student(2, "Rahul", "Bengaluru");
		
		
		System.out.println(s1.getRollNo()); // 10 
		System.out.println(s1.getName());
		System.out.println(s1.getCity());
		
		System.out.println(s2.getRollNo()); // 2 
		System.out.println(s2.getName()); // Rahul
		System.out.println(s2.getCity()); // B
		
		s1.changeRoll(); 
		System.out.println(s1.rollNo); // 110
		System.out.println(collegeName);
		System.out.println(Student.collegeName); // recommended
		
		System.out.println(getCollegeName());
		Student.setCollegeName("Mumbai University");
//		setCollegeName("Mumbai University");
		System.out.println(Student.getCollegeName()); // recommended
		
		System.out.println("-----------------------");
		
		s1.intro();
		s2.intro();
		
	}

	

}
