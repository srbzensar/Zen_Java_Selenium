package strings;

public class ImmutableString {

	public static void main(String[] args) {

		String s = "Sachin"; // SCP: String Constant Pool
		System.out.println("s " + s);
		
//		System.out.println(s.charAt(0));
//		s[0] = 't';
//		s.charAt(0) = 'R';
		
		String t = "Tendulkar";
		System.out.println("t " + t);
		
		String r = "Sachin";
		System.out.println("r " + r);
		
		System.out.println(s.equals(t)); // compares the values
		System.out.println(s == t); // compares the reference
		
		System.out.println(s.equals(r)); // 
		System.out.println(s == r);
		
		String u = new String("Sachin");
		String v = "sachin";
		
		System.out.println(s.equals(u)); // t			
		System.out.println(s == u); // f				
		
		
	}

}
