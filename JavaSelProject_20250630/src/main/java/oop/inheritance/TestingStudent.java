package oop.inheritance;

public class TestingStudent extends Student 
{
	String toolName;
	
	public TestingStudent(int roll, String name, String city, String course, String toolName) 
	{
		super(roll, name, city, course);
		this.toolName = toolName;
	}

	public void display()
	{
		System.out.println("I am testing student");
	}

	public static void main(String[] args) 
	{
		TestingStudent t = new TestingStudent(1, "Akash", "Bihar", "Java", "Selenium");
		
		System.out.println(t.name); // GP Property
		System.out.println(t.course); // P Property
		System.out.println(t.toolName); // own property
		
		t.intro();
		t.show();
		t.display();
	}
}
