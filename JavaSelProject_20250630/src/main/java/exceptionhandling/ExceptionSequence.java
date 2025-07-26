package exceptionhandling;

public class ExceptionSequence {

	public static void main(String[] args) {

		System.out.println("Hello");
		
		int x = 18;
//		int y = 5; 
		int y = 18;
		
//		-------------------------------------
		
//		try
//		{
////			y = 10/(x-y);
////			System.out.println("Ans is " + y);
////			String s=null;
////			System.out.println(s.length());
//			int a[] = {10, 20, 30};
//			a[3] = 40;
//		}
//		catch(Exception e)
//		{
//			System.out.println("some exception occurred");
//		}
//		catch(ArithmeticException e)
//		{
//			System.out.println(e);
//		}
//		catch(NullPointerException e)
//		{
//			System.out.println(e);
//		}
		
//		---------------------------------
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
			System.out.println(e);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			int a[] = {10, 20, 30};
			a[2] = 40;
		}
		catch(Exception e)
		{
			System.out.println("some exception occurred");
		}
		finally
		{
			System.out.println("Files and DB connections are closed");
		}
		
		System.out.println("Thank you");
	}

}
