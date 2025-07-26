package i.exceptionhandling;

public class DExceptionTypes {

	public static void main(String[] args) {

		System.out.println("Hello");
		
//		ArithmeticException
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
		
//		try
//		{
//			y = 10/(x-y);
//			System.out.println("Ans is " + y);
//		}
//		catch(Exception e)
//		{
//			System.out.println(e);
//		}
		
//		try
//		{
//			String s=null;
//			System.out.println(s.length());
////			y = 10/(x-y);
////			System.out.println("Ans is " + y);
//		}
//		catch(Exception e)
//		{
//			System.out.println(e);
//		}
		
//		try
//		{
////			y = 10/(x-y);
////			System.out.println("Ans is " + y);
////			String s=null;
////			System.out.println(s.length());
//			int a[] = {10, 20, 30};
//			a[3] = 40;
//		}
//		catch(ArithmeticException e)
//		{
//			System.out.println("Arithmetic Exception occurred");
//		}
//		catch(NullPointerException e)
//		{
//			System.out.println("NullPointer Exception occurred");
//		}
//		catch(Exception e)
//		{
//			System.out.println("Some exception occurred");
//		}
		
		
		
		
////		NullPointerException
//		String s=null;
//		System.out.println(s.length());
		
////		NumberFormatException
////		String n = "10";
//		String n = "ten";
//		int a = Integer.parseInt(n);
//		System.out.println(a);
		
////		ArrayIndexOutOfBoundsException
//		int a[] = {10, 20, 30};
//		a[3] = 40;
		
		
		System.out.println("Thanks");
		
	}

}
