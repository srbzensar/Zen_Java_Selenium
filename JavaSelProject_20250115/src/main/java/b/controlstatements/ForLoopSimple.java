package b.controlstatements;

public class ForLoopSimple {

	public static void main(String[] args) {

//		for(intialization; condition; increament/ decreament)

		
//		for(int i=1; i<=10; i++)
//		{
//			System.out.println("Hello" + i);
//		}
		
//		for(int i=1; i<=10; i++)
//		{
//			System.out.println(i);
//		}
		
		for(int i=1; i<=10; i++)
		{
			System.out.print(i + " ");
		}
		
//		challenge
//		1. print numbers 10 to 1
//		2. print numbers 0 to 9
		
		System.out.println();
		
		for(int i=10;i>=1;i--)
		{
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for(int i=0; i<=9; i++)    // n =  9  
		{
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for(int i=0; i<10; i++)  // n = 10  
		{
			System.out.print(i + " ");
//			System.out.print(i + "\t");  // \t tab
//			System.out.print(i + "\n");  // \n newline
		}
		
		System.out.println();
//		----------------------------
		String name = "Sachin Tendulkar";
		for(int i=0;i<name.length();i++)
			System.out.println(name.charAt(i));
		
		
		
	}

}
