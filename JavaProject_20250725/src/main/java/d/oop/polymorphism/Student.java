package d.oop.polymorphism;

public class Student extends Person {
	
	int rollNo;
	String course;
	
	public Student()
	{
		super();	
		rollNo = 1;
		course = "Java";
	}

	public Student(int rollNo, String name, String city, String course) 
	{
		super(name, city);
		this.rollNo = rollNo;
		this.course = course;
	}
	
	@Override
	public void intro() 
	{
		System.out.println("Hey, I am " + this.name + " from " + this.city + " learning " + this.course);
	}

	public static void main(String[] args) 
	{
		Student s = new Student();
		
//		System.out.println(s.name);
//		System.out.println(s.city);
		s.intro();
		
		Student s2 = new Student(7, "Dhoni", "Ranchi", "Python");
		s2.intro();
		
		Person p = new Person("Virat", "Delhi");
		p.intro();
		
		Person p2 = new Student(11, "Pant", "Pune", "JavaScript");
		p2.intro();
	}
}
