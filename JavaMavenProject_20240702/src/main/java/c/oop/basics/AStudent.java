package c.oop.basics;

public class AStudent {

//	instance properties/ instance variable
	int rollNo;
	String name;
	String city;
	
// class level/ static
	static String collegeName="Pune University"; 
	
//	empty constructor, name is same as class, get called automatically during object creation
	public AStudent()
	{
		rollNo = 1;
		name = "Pant";
		city = "Delhi";
	}
	
	
	
//	instance methods
//	setter
//	public void setRollNo(int roll)
//	{
//		rollNo = roll;
//	}
	
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
	
	
//	static method
	public static void main(String[] args) {
//		int i = 10; // local variable
		
		AStudent s1 = new AStudent();
		
		System.out.println("S1 rollNo: " + s1.rollNo);
		System.out.println("S1 name: " + s1.name);
		System.out.println("S1 city: " + s1.city);
		
		s1.display();
		
//		
	}

}
