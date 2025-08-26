package c.oop.inheritance.extra;

public class TestingStudent extends Student {

	String toolName;
	
	public TestingStudent(int rollNo, String name, String city, String course, String toolName) 
	{
//		if we are calling the parent class constructor, that must be the first statement
		super(rollNo, name, city, course);
		this.toolName = toolName;
	}

	public static void main(String[] args) {
		
		TestingStudent t = new TestingStudent(1, "Akash", "Mumbai", "Java", "Selenium");

		System.out.println(t.rollNo);
		System.out.println(t.name);
		System.out.println(t.toolName);
		
		t.intro();
	}

}
