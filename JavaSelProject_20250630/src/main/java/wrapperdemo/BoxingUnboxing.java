package wrapperdemo;

public class BoxingUnboxing {

	public static void main(String[] args) {

		int a = 10;
		int b;
		
//		Integer wrapper class
		Integer x;
		
//		x = Integer.valueOf(a); // before Java 5
		x = a;  // Autoboxing
//		---------------
		
//		b = x.intValue();  // before Java 5
		b = x;  // Unboxing
		
		System.out.println(a);
		System.out.println(x);
		System.out.println(b);
		
	}

}
