package exceptionhandling;

public class ExceptionHandlingWays {

	public static void main(String[] args) {

		System.out.println("Hello");
		
		int x = 18;
//		int y = 5; 
		int y = 18;
		
		try
		{
			y = 20/ (x-y);
			System.out.println("Ans is " + y);
		}
		catch(ArithmeticException e)
		{
//			System.out.println(e);
//			System.out.println("something went wrong. Please contact admin");
			System.out.println("Please enter age other than 18");
		}
		
		System.out.println("Thank you");
		
		
	}

}
