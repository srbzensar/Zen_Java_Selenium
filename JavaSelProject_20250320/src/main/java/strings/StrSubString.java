package strings;

public class StrSubString {

	public static void main(String[] args) {

		String str = "Sachin Tendulkar";
		
		System.out.println(str);

		System.out.println(str.substring(7));
		System.out.println(str.substring(5));

		System.out.println(str.substring(4, 6)); // in
		System.out.println(str.substring(4, 20)); // Exception
		
		
	}

}
