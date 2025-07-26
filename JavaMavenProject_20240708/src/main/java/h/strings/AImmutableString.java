package h.strings;

public class AImmutableString {

	public static void main(String[] args) {
//		String is immutable
		
		String s = "Sachin"; // String constant Pool (on heap memory)
		
		String t = "Sachin";
//		s[0] = 'S';
//		s.charAt(0) = 'R';
		
		
		System.out.println(s);	// Sachin
		System.out.println(s.hashCode());
		System.out.println(t);	// Sachin
		System.out.println(t.hashCode());
		
		s = s + "Tendulkar";
//		s = "Tendulkar";
		System.out.println(s); // Tendulkar 
		System.out.println(s.hashCode());
		
		System.out.println(t);
		System.out.println(t.hashCode());
	}

}
