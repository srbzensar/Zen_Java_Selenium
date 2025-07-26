package exceptionhandling;

public class ExceptionTypes {

	public static void main(String[] args) {

		System.out.println("Hello");
		
		int x = 18;
//		int y = 5; 
		int y = 18;
		
//		try
//		{
//			y = 20/ (x-y);
//			System.out.println("Ans is " + y);
//		}
//		catch(ArithmeticException e)
//		{
////			System.out.println(e);
////			System.out.println("something went wrong. Please contact admin");
//			System.out.println("Please enter age other than 18");
//		}
		
//		try
//		{
//			String s = null;
//			System.out.println(s.length());
//		}
//		catch(NullPointerException e)
//		{
//			System.out.println(e);
//		}
		
//		-------------------------------------
		
		try
		{
//			y = 10/(x-y);
//			System.out.println("Ans is " + y);
//			String s=null;
//			System.out.println(s.length());
			int a[] = {10, 20, 30};
			a[3] = 40;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println("some exception occurred");
		}
		
		System.out.println("Thank you");
		
		
	}

}
