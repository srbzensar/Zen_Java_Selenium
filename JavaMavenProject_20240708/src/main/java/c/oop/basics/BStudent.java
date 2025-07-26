package c.oop.basics;

public class BStudent {

//	instance properties/ instance variable
	int rollNo;
	String name;
	String city;
	
	// class level/ static
	static String collegeName="Pune University";
	
//	empty constructor (if not defined, default constructor will be called)
//	name is same as class
//	gets called automatically during object creation
	public BStudent()
	{
		rollNo = 10;
		name = "Sachin";
		city = "Mumbai";
	}
	
//	parameterized constructor
	public BStudent(int rollNo, String name, String city)
	{
		this.rollNo = rollNo;
		this.name = name;
		this.city = city;
	}
//	constructor overloading
	
//	static method
	public static String getCollegeName() {
		return collegeName;
	}

	public static void setCollegeName(String collegeName) {
		BStudent.collegeName = collegeName;
	}

	//	instance/ object level methods
//	getter method
	public int getRollNo()
	{
		return rollNo;
	}

//	setter method
	public void setRollNo(int roll)
	{
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
	
	public void changeRoll()
	{
		this.rollNo += 100;
	}
	
	public void show()
	{
		System.out.println("Hello, I am " + this.name + " RollNo " + this.rollNo + " from " + city);
	}
	
	
//	class level/ static method
	public static void displayHoliday()
	{
		System.out.println("Tomorrow is a holiday");
	}
	
	public static void main(String[] args) {
//		int i=10; // local variable
		
//		String name = "Saurav";
//		String city = new String("Delhi");
		
//		Creating object of a class
		BStudent s1 = new BStudent(1, "Saurav", "Bengal");
		BStudent s2 = new BStudent(2, "Dhoni", "Ranchi");
		BStudent s4 = new BStudent(3, "Kohli", "Chandigarh");
		BStudent s3 = new BStudent();
		
		
//		can't access instance property & methods without using object of the class
//		System.out.println(rollNo);
//		getRollNo();
		
//		can access static property & methods without using object of the class
		System.out.println(collegeName);
		displayHoliday();
		setCollegeName("New Pune Uni");
		System.out.println(getCollegeName());
		
		
		System.out.println(s1.rollNo);
		System.out.println(s1.name);
		System.out.println(s1.city);
		
		System.out.println(s1.getCity());
		s1.show();
		
		s2.show();
		
		s3.show();
		s4.show();
		
		s1.changeRoll();
		s3.changeRoll();
		
		s1.show();
		s2.show();
		s3.show();
		
	}
	


}
