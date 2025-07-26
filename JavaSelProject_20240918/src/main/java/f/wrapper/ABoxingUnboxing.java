package f.wrapper;

public class ABoxingUnboxing {

	
	
	public static void main(String[] args) {
		int a = 10;
		int b;
		
//		Integer y = 50;
//		
//		System.out.println(a);
//		System.out.println(y);
//		------------------------------------
		
		Integer x;
		
		x = a; // auto boxing 
//		x = Integer.valueOf(a); // before Java 5
		
		b = x; // unboxing
//		b = x.intValue();
		
		System.out.println(a);
		System.out.println(x);
		
		System.out.println(b);
		
//		-------------------------------
		
		Integer z = new Integer(50);
		System.out.println(z);
		
		
	}

}
