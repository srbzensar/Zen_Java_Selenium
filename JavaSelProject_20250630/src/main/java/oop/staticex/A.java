package oop.staticex;

class B 
{
	static 
	{
		System.out.println("static block: Parent class B");
	}
}


public class A extends B{

	
	int rollNo;
	static String collegeName;

	static
	{
		System.out.println("static block executed A");
		collegeName = "Pune University";
//		rollNo = 1; // error
	}
	
	
	public static void main(String[] args) {

		System.out.println("hello Main");
		System.out.println(collegeName);	
		
	}

}
