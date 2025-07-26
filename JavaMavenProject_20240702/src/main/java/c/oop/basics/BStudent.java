package c.oop.basics;

public class BStudent {

//	instance properties/ instance variable
	int rollNo;
	String name;
	String city;
	
	static String collegeName="Pune University"; // class level
	

////	default constructor
	public BStudent()
	{
		rollNo = 1;
		name = "Pant";
		city = "Delhi";
	}
	
////	parameterized constructor
	public BStudent(int rollNo, String name, String city)
	{
		this.rollNo = rollNo;
		this.name = name;
		this.city = city;
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

	public void setRollNo(int rollNo)
	{
//		rollNo = rollNo;
		this.rollNo = rollNo;
	}
	
	public int getRollNo()
	{
//		return rollNo;
		return this.rollNo;
	}
	
	
	public void display()
	{
		System.out.println("Hello, I am " + this.name + " from " + this.city);
	}
	
	public static void calScore()
	{
		System.out.println("Score calculated");
	}
	
	
//	static method
	public static void main(String[] args) {
//		int i = 10; // local variable
		
		BStudent s1 = new BStudent(1, "Sachin", "Mumbai");
		BStudent s2 = new BStudent(2, "Rahul", "Bengaluru");
		BStudent s3 = new BStudent(); 
		
		
		System.out.println("S1 rollNo: " + s1.rollNo);
		System.out.println("S1 name: " + s1.name);
		System.out.println("S1 city: " + s1.city);
		
//		static properties and methods can be accessed directly 
		System.out.println("College name: " + collegeName);
		calScore();
		
		s1.display(); 
		s2.display();
		s3.display(); 
		
		
	}

}
