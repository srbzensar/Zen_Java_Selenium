package c.oop.staticex;

class B
{
	static
	{
		System.out.println("static block of B");
	}
}

public class A extends B{
//public class A{

	int rollNo;
	static String collegeName;
	
	static
	{
		System.out.println("static block executed");
		collegeName = "Pune University"; 
//		rollNo = 1; // instance property can't be accessed by static block
	}
	
	
	public static void main(String[] args) {
		System.out.println("hello main");
		
		System.out.println("college name: " + collegeName);
	}

}
