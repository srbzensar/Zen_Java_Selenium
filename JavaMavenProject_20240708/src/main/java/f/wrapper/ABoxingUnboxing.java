package f.wrapper;

public class ABoxingUnboxing {

	public static void main(String[] args) {

		int a = 10;
		int b;

//		Wrapper Classes
		Integer x;	
		
		x = a; // Autoboxing
//		x = Integer.valueOf(a); // before Java 5
		

		b = x; // Unboxing
//		b = x.intValue();  
		
		System.out.println(a);
		System.out.println(x);
		
		
//		Integer y = new Integer(20);
//		System.out.println(y);

	}

}
