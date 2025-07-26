package c.oop.inheritance;

public class Student extends Person {

	int rollNo=1;
	String course = "Java";
	
//	Student()
//	{
//		
//	}
	
	
	Student(int rollNo)
	{
//		calling parent class constructor is not mandatory
//		super();  // it's not mandatory to call
		this.rollNo = rollNo;
	}
	
	
	public Student(int rollNo, String name, String city) {
		super(name, city);  // must be the first statement here
		this.rollNo = rollNo; 
	}
	
	public void show()
	{
		System.out.println("show");
	}
	
	
//	overriding the intro method
	@Override
	public void intro()
	{
		System.out.println("Hello, I'm " + name + " from " + city + " learning " + course);
//		return("Hello, I'm " + name + " from " + city + " learning " + course);
	}


	public static void main(String[] args) {

		Student s = new Student(10);
		System.out.println("RollNo: " + s.rollNo);
		System.out.println("Name: " + s.name);
		System.out.println("City: " + s.city);
		s.intro();
		
//		Student s2 = new Student(7, "Dhoni", "Ranchi");
//		s2.intro();
		
		Person p = new Person();
		p.intro();
		
	}

}
