package h.strings;

public class DStrsubstring {

	public static void main(String[] args) {

		String str = "Sachin Tendulkar";
		
//		substring(int startIndex);
//		substring(int startIndex, int endIndex);
//						inclusive	exclusive
		
//		
		System.out.println(str.substring(7)); // Tendulkar
		System.out.println(str.substring(5)); // n Tendulkar
		System.out.println(str.substring(4, 6)); // in
		System.out.println(str.substring(4, 7)); // in 
//		System.out.println(str.substring(4, 20)); // Exception : index out of bound
		
		
		
	}

}
