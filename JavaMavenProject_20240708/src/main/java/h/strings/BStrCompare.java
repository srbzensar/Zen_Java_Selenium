package h.strings;

public class BStrCompare {

	public static void main(String[] args) {
//		String is immutable
		
		String s = "Sachin"; 
		String t = "Sachin";
		String u = new String("Sachin");
		String v = "Virat";
		String r = "sachiN"; 
		
		System.out.println(s.equals(t)); // t
		System.out.println(s.equals(u)); // t
		System.out.println(s.equals(v)); // f
		System.out.println(s.equals(r)); // f
		System.out.println(s.equalsIgnoreCase(r)); // t
		
////		---------------------------
////		== operator compares references, not values
		
		System.out.println(s == t); // t
		System.out.println(s == u); // f
	
//		------------------------------------
//		compareTo()   it compares the strings lexicographically
		
//		s1 == s2   // 0
//		s1 > s2		// +ve number
//		s1 < s2		// -ve number

		
		String s1 = "hello";
		String s2 = "hello";
		String s3 = "hello2";
		String s4 = "hello3";
		String s5 = "fello";
		String s6 = "jello";
		
		System.out.println(s1.compareTo(s2)); // 0
		System.out.println(s1.compareTo(s3)); // -ve 
		System.out.println(s1.compareTo(s4)); // -ve 
		System.out.println(s3.compareTo(s4)); // -ve 
		System.out.println(s4.compareTo(s3)); // +ve 
		System.out.println(s5.compareTo(s4)); // -2
		System.out.println(s6.compareTo(s4)); // 2
		
		
	}
	
	

}
