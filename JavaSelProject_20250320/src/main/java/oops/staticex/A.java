package oops.staticex;

class B
{
	static 
	{
		System.out.println("static block B");
	}
}


public class A extends B {

	int rollNo;
	static String collegeName;
	
	public void display()
	{
		System.out.println(this.rollNo);
	}
	
	
	static
	{
		System.out.println("static block A");
		collegeName = "Pune University"; 
//		rollNo = 1; // can't access instance property from static block or static method
	}
	
	public static void main(String[] args) {

		
		System.out.println("Hello main");
//		System.out.println("College Name " + collegeName);
//		System.out.println("College Name " + A.collegeName);

		
		
//		rollNo = 1;
//		display();
		
	}

}
