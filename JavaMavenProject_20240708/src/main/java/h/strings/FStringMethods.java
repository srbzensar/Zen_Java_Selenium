package h.strings;

public class FStringMethods {

	public static void main(String[] args) {

		String str = "Sachin Tendulkar";
		String str3 = "    Sachin Tendulkar   ";
		String str1 = " \t\n Sachin Tendulkar  \t ";
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		System.out.println(str.indexOf("Ten")); // index if available
		System.out.println(str.indexOf("Two")); // -1 if not available
		System.out.println(str.contains("Ten")); // true
		System.out.println(str.contains("Two")); // false
	
		System.out.println(str.startsWith("Sac")); 
		System.out.println(str.endsWith("kar")); 
		
		System.out.println(str.charAt(7)); // T
		System.out.println(str.indexOf("T")); // 7
		
		System.out.println(str.length());

		System.out.print(str3);
		System.out.println("!");
		System.out.print(str3.trim()); // space character
		
		System.out.print(str1);
		System.out.println("!");
		System.out.print(str1.strip()); // whitespace start and end
//		System.out.print(str1.stripLeading()); // whitespaces at the start
//		System.out.print(str1.stripTrailing()); // whitespaces at the start
		System.out.println("!");
//		
		String str2 = "Now, let's check. This is a new word";
		System.out.println(str2.replace('n', 'm'));
//		System.out.println(str2.replace(" ", ""));
//		
		
		String str4 = "now, let's do a new check. This is a new word";
		System.out.println(str4.replace("new", "old"));
		
//		System.out.println(str4.replaceAll("new", "old"));
		
//		
		
	}

}
