package i.exceptionhandling;

public class FExceptionFinally {

	public static void main(String[] args) {

		System.out.println("Hello");
		
//		ArithmeticException
		int x = 18;
		int y = 5; 
//		int y = 18;  
		
		try
		{
			y = 10/(x-y);
			System.out.println("Ans is " + y);
//			String s=null;
//			System.out.println(s.length());
//			int a[] = {10, 20, 30};
//			a[3] = 40;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception occurred");
		}
		catch(NullPointerException e)
		{
			System.out.println("NullPointer Exception occurred");
		}
		catch(Exception e)
		{
			System.out.println("Some exception occurred");
		}
		finally
		{
			System.out.println("All files are closed. DB Connection is closed");
		}
		
		
//		System.out.println("Reopen DB connection");
		
		
		
		System.out.println("Thanks");
		
	}

}
