package b.controlstatements;

public class AAssignmentMaxOfNumbers {

	public static void main(String[] args) {

//		int a=10, b=9, c=7;
//		if (a>b)
//		{
//			if (a>c)
//				System.out.println("Maximum number is A");
//			else 
//				System.out.println("Maximum number is C");
//		}
//		else
//		{
//			if (b>c)
//				System.out.println("Maximum number is B");
//			else
//				System.out.println("Maximum number is C");
//		}
		
//		int a=10;
//		int b=10;
//		int c=10;
//				
//		if( a>=b && a>=c) 
//		{
//			System.out.println("A is Max");
//		}
//		else if(b>=a && b>=c) 
//		{
//			System.out.println("B is Max");
//		}
//		else
//			System.out.println("C is Max");
//		}
		
		
		int a=10;
		int b=10;
		int c=10;
				
		if( a>b && a>c) 
		{
			System.out.println("A is Max");
		}
		else if(b>a && b>c) 
		{
			System.out.println("B is Max");
		}
		else if(c>a && c>b)
		{
			System.out.println("C is Max");
		}
		else
			System.out.println("Equal");
	}
}
