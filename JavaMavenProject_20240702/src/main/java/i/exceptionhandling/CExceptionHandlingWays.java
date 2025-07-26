package i.exceptionhandling;

public class CExceptionHandlingWays {

	public static void main(String[] args) {

		System.out.println("Hello");
		
		int x = 18;
//		int y = 5; 
		int y = 18;  
		
		try
		{
			y = 10/(x-y);
			System.out.println("Ans is " + y);
		}
		catch(ArithmeticException e)
		{
//			System.out.println(e);
//			System.out.println("something went wrong. Please contact admin.");
			System.out.println("please enter age other than 18");
		}
		
		
		System.out.println("Thanks");
		
	}

}
