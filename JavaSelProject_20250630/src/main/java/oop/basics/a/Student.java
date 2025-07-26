package oop.basics.a;

public class Student {
//	instance property
	int rollNo;
	String name;
	String city;
	
//	default constructor: if we don't define even a single contructor, 
//	default constructor will be called.
	
//	constructor (empty constructor)
	public Student()
	{
		rollNo = 10;
		name = "Sachin";
		city = "Mumbai";
	}
	
//	getter and setter methods for the properties
	public int getRollNo()
	{
		return rollNo;
	}
	
	public void setRollNo(int roll)
	{
//		this.rollNo = roll; // using this keyword is optional here
		rollNo = roll;
	}
	
	public String getName() {
//		return this.name;
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

	public static void main(String[] args) {
		Student s1 = new Student();
		
		System.out.println(s1.getRollNo()); 
		System.out.println(s1.getName());
		System.out.println(s1.getCity());
	}

}
