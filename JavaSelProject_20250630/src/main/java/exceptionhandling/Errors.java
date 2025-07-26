package exceptionhandling;

public class Errors {

	public static void main(String[] args) {
//		compilation error 
//		int a = ;  // syntax error
//		float b = 3.14; // syntax error
		
//		logical error
//		int a = 10;
//		int b = 5;
//		
//		if(a<b)
//			System.out.println(a + " is greater ");
//		else
//			System.out.println(b + " is greater ");
		
		
//		Runtime error/ exception
		int x = 10;
		int y = 10/(x-x); 
		System.out.println(y);
		
		System.out.println("Thank you");
	}

}
