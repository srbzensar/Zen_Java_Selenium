package strings;

public class ImmutableString {

	public static void main(String[] args) {
		
		String s = "Sachin";
		System.out.println(s);		// S
		System.out.println(s.hashCode());
		String t = "Sachin";
		System.out.println(t.hashCode());
		
		s = s + "Tendulkar";
		System.out.println(s);     // ST
		System.out.println(s.hashCode()); 
		
//		M			I
//		-----------------------------------
		
//		System.out.println(s.charAt(0)); // S
////		s[0] = 'R';
////		s.charAt(0) = 'R';
//		
//		System.out.println(s);
//		------------------------------------
		
//		System.out.println(s); 
		System.out.println(t); 
		System.out.println(t.hashCode());
		
	}

}
