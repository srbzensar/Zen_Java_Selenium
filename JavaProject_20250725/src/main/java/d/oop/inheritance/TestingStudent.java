package d.oop.inheritance;

public class TestingStudent extends Student 
{
	String toolName;
	
	public TestingStudent(int rollNo, String name, String city, String course, String toolName) {
//		if we are calling the parent class constructor, that must be the first statement
		super(rollNo, name, city, course); 
		this.toolName = toolName;
	}

	public static void main(String[] args) {

		TestingStudent t = new TestingStudent(15, "Vinod", "Mumbai", "Java", "JMeter");
		
		System.out.println(t.rollNo);
		System.out.println(t.name);
		System.out.println(t.toolName);
		
		t.intro();
		TestingStudent.takeExam();
	}
}
