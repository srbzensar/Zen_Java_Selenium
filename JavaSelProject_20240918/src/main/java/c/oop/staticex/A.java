package c.oop.staticex;

class B
{
	static
	{
		System.out.println("static block of Parent class B");
	}
}


public class A extends B{
	
	int rollNo;
	static String collegeName;
	

	static
	{
		System.out.println("static block executed A");
		collegeName = "Pune University"; // static property should not be initialized in the constructor
//		rollNo = 1; // can't access instance property from static block or static function
	}
	
	
	public static void main(String[] args) {

		System.out.println("hello main");
		
		System.out.println("College name: " + collegeName);
		System.out.println("College name: " + A.collegeName);
		
//		System.out.println(rollNo); // can't access instance property from static block or static function
	}

}
