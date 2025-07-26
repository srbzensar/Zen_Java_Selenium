package exceptionhandling;

public class ExceptionTypes {

	public static void main(String[] args) {

		System.out.println("Hello");

		int x  = 18;
		int y = 18;
		
//		try
//		{
//			y = 50/(x-y);
//			System.out.println("Ans is " + y);
//		}
//		catch(ArithmeticException e)
//		{
//			System.out.println(e);
//		}
		
//		try
//		{
//			y = 50/(x-y);
//			System.out.println("Ans is " + y);
//		}
//		catch(Exception e)
//		{
//			System.out.println(e);
//		}

		try
		{
//			y = 50/(x-y);
//			System.out.println("Ans is " + y);
//			String s = null;
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
			System.out.println(e);
		}
		finally
		{
			System.out.println("All files are closed");
		}
		
		
		System.out.println("Thanks");
		
	}

}
