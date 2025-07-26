package exceptionhandling;

public class ExceptionHandlingEx {

	public static void main(String[] args) {

		System.out.println("Hello");

		int x  = 18;
		int y = 18;
		
		try
		{
			y = 10/(x-y);
			System.out.println("Ans is " + y);
		}
		catch(ArithmeticException e)
		{
//			System.out.println(e);
//			System.out.println("Something went wrong, please contact admin");
			System.out.println("Please enter age other than 18");
		}
		
		System.out.println("Thanks");
		
	}

}
