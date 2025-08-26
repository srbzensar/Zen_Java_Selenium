package c.oop.basics.c;

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

	public int getRollNo()
	{
		return this.rollNo;
	}
	
	public void setRollNo(int rollNo)
	{
		this.rollNo = rollNo;
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

	public static String getCollegeName() {
		return collegeName;
	}

	public static void setCollegeName(String collegeName) {
		Student.collegeName = collegeName;
	}
	
	public void changeRollNo()
	{
		this.rollNo += 100;
	}
	
	public void intro()
	{
		System.out.println("Hello, I am " + this.name + " from " + this.city);
	}
	
	public static void displayHoliday()
	{
		System.out.println("Tomorrow is a holiday!");
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
		
		System.out.println(s1.getRollNo());
		s1.setRollNo(20);
		System.out.println(s1.getRollNo());
		
		System.out.println(getCollegeName());
		setCollegeName("Mumbai University");
		System.out.println(getCollegeName());
		
		System.out.println(s2.rollNo);
		s2.changeRollNo();
		System.out.println(s2.rollNo);
//		-----------------------------------------
		s1.intro();
		s2.intro();
		
		Student.displayHoliday();
		
	}
}
