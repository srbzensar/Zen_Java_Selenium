package c.oop;

public class AStudent {

//	instance properties/ instance variables
	int rollNo;
	String name;
	String city;
	
//	class level/ static property
	static String collegeName = "Pune University";

	
//	static method
	public static String getCollegeName() {
		return collegeName;
	}

	public static void setCollegeName(String collegeName) {
		AStudent.collegeName = collegeName;
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

	public static void main(String[] args) {
		int i = 10; // local variable
		
		AStudent s1 = new AStudent();
		
		System.out.println(s1.rollNo);
		System.out.println(s1.name);
		System.out.println(s1.city);
		
		System.out.println(s1.getCity());
		
		
		
	}

}
