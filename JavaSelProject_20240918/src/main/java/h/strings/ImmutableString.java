package h.strings;

public class ImmutableString {

	public static void main(String[] args) {

//		String is immutable
		
		String s = "Sachin";	// String Constant Pool	
		System.out.println(s); 
		
		String t = "Sachin";
		
		
		System.out.println(s.charAt(0));
//		s.charAt(0) = 'R';
//		s[0] = 'R';
		
		t = "Tendulkar";
		System.out.println("s " + s);
		
		System.out.println("t " + t);
		
		String r = "Sachin";
		System.out.println("r " + r);
		
		System.out.println(s.equals(t));	// compares the values
		System.out.println(s == t);			// compares the references
		
		System.out.println(s.equals(r));
		System.out.println(s == r);
		
	}

}
