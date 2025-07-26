package c.oop.inheritance;

public class TestingStudent extends Student {

	String toolName;
	
	public TestingStudent(int rollNo, String name, String city, String toolName) {
		super(rollNo, name, city);
		this.toolName = toolName;
	}

	public static void main(String[] args) {
		
		TestingStudent t = new TestingStudent(1, "Akash", "Mumbai", "Selenium");

		System.out.println(t.rollNo);
		System.out.println(t.name);
		System.out.println(t.toolName);
		
		t.intro();
	}

}
