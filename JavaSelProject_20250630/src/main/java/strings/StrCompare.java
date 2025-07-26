package strings;

public class StrCompare {

	public static void main(String[] args) {

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
		
//		-------------------------------
//		== operator compares references, not values
		
		System.out.println(s == t); // t
		System.out.println(s == u); // f
	}
}
