package strings;

public class StringMethods {

	public static void main(String[] args) 
	{
		
		String str = "Sachin Tendulkar";
//		System.out.println(str);
//		System.out.println(str.toUpperCase());
//		System.out.println(str.toLowerCase());
//		
//		System.out.println(str.indexOf("Ten")); // 
//		System.out.println(str.indexOf("Two")); //
//		
//		System.out.println(str.contains("Ten")); // true
//		System.out.println(str.contains("Two")); // false
//		
//		System.out.println(str.startsWith("Sac")); 
//		System.out.println(str.endsWith("kar")); 
//		
//		System.out.println(str.charAt(7)); 
//		System.out.println(str.indexOf("T")); // 7
//		
//		System.out.println(str.length()); 
		
		String str3 = "    Sachin Tendulkar   ";
		String str1 = " \t\n Sachin Tendulkar  \t ";
		
		System.out.print(str3);
		System.out.println("!");
		
		System.out.print(str3.trim());
		System.out.println("!");
//		-------------------------
		
		System.out.print(str1);
		System.out.println("!");

//		System.out.print(str1.trim());
//		System.out.print(str1.strip());
//		System.out.print(str1.stripLeading());
		System.out.print(str1.stripTrailing());
		 
		System.out.println("!");
		
		
		
	}

}
