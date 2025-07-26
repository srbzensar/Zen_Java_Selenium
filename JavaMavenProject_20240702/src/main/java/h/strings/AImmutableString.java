package h.strings;

public class AImmutableString {

	public static void main(String[] args) {
//		String is immutable
		
		String s = "Sachin"; // String constant Pool
		
		String t = "Sachin";
//		s[0] = 'R';
//		s.charAt(0) = 'R';
		
		
		System.out.println(s);	// Sachin
		System.out.println(t);	// Sachin
		
		t = "Tendulkar";
		System.out.println("s " + s);	// Sachin
		
		System.out.println("t " + t); 	// Tendulkar

		String r = "Sachin";
		System.out.println("r " + r);
		
//		equals() compares values			== compares references
	
		System.out.println(s.equals(t));	// f
		System.out.println(s == t);			// f
		
		System.out.println(s.equals(r));	// t
		System.out.println(s == r);			// t
	}

}
