package a.basics;

public class BPrintVariables {
	public static void main(String[] args) {
		System.out.println("Welcome message");
		System.out.println(10);
		System.out.println(2+3);
		System.out.println("Hi " + "Fi");
		
		System.out.println("Hi + Fi");
		
		System.out.println("Hi " + 5);
		System.out.println(5 + "Hi ");
		
		String name = "Sachin Tendulkar";
		System.out.println(name);  // "Sachin Tendulkar" 
		System.out.println("name"); // name
//		System.out.println(kiran);  // error 
//		System.out.println(SachinTendulkar);  // error 
		
		int age = 21;
		System.out.println(age); // 21 
//		System.out.println("age"); // age 
		System.out.println(19); // 19 
		System.out.println("30"); // 30 
		
		System.out.println(19 + 1);
        System.out.println("30" + "5"); 		
	}
}
