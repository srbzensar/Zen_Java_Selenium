package c.oop.inheritance;

public class TestingStudent extends Student {

	String toolName;
	
	public TestingStudent(int rollNo, String name, String city, String toolName) {
		super(rollNo, name, city);
		this.toolName = toolName;
	}
	
	public void display()
	{
		System.out.println("I am testing student");
	}

	public static void main(String[] args) {
		
		TestingStudent t = new TestingStudent(1, "Akash", "Mumbai", "Selenium");

		System.out.println(t.name); // GP property
		System.out.println(t.rollNo);	// P property
		System.out.println(t.toolName); // own property
		
		t.intro();  // GP method, but if overridden, then new method will get used
		t.show(); // P method
		t.display(); // own method
	}

}
