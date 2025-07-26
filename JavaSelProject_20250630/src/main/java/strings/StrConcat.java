package strings;

public class StrConcat {

	public static void main(String[] args) 
	{
		String s = "Sachin"; 
		String r = "Sachin";
		String t = "Tendulkar";
		
		s.concat(t);
		System.out.println(s);
		
		s = s.concat(t);
		System.out.println(s);
		
//		----------------------------
		
		s = "Virat" + "Kohli";
		System.out.println(s);
		
//		---------------------------
		
		s = 40 + "Virat";
		System.out.println(s);
		
//		---------------------------
		
		System.out.println(String.format("%s %s",r,t));
		
//		String v = String.format("%s\t%s",r,t);
//		
//		int d = 10;
//		v = String.format("%s %d %s",r,d,t);
//		
//		System.out.println(v);
//		-------------------------------
		
//		String.join() method - Java8 onwards
		
//		v = String.join(" ", r, t);
//		v = String.join("\t", r, t);
//		v = String.join("", r, t);
//		v = String.join(" ", r, t, "Mumbai");
		
		
//		System.out.println(v);
		
	}

}
