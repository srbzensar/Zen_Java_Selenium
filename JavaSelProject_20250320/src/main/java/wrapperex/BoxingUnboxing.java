package wrapperex;

public class BoxingUnboxing {

	public static void main(String[] args) {

		int a = 10;
		int b;
		
		Integer y = 50;
		
		System.out.println(a);
		System.out.println(y);
		
//		----------------------------------------
		Integer x;
//		x = Integer.valueOf(a); // before Java 5
		x = a; // auto boxing
		
		System.out.println(x);
		
//		b = x.intValue();
		b = x;
		System.out.println(b);
	}

}
