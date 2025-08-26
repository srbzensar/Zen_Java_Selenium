package d.oop.staticex;

public class A {
	
	int roll;
	static String college;

	A()
	{
		System.out.println("constructor got called");
	}
	
	static
	{
		System.out.println("static block");
		A.college = "Pune University";
	}
	
	public static void main(String[] args)
	{
		System.out.println("main");
		
	}

}
