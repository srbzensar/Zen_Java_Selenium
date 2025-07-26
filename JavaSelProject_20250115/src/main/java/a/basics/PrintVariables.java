package a.basics;

public class PrintVariables {

	public static void main(String[] args) {
		System.out.println("Hello Java");
        System.out.println(10);
        // System.out.println("10");
        System.out.println(2+3); // 5
        System.out.println("Hi " + "Fi"); // Hi Fi
        System.out.println("Hi + Fi"); // Hi + Fi
        System.out.println("Hi " + 5); // Hi 5
        System.out.println(5 + " Hi"); // 5 Hi
        
        String name = "Sachin Tendulkar";
        System.out.println(name); // "ST"
        System.out.println("name"); // name
//        System.out.println(Kiran); //  error
        
        int age = 25;
        System.out.println(age);

        System.out.println("age"); // age
        
        System.out.println(age + 5); // 30
        System.out.println("30" + "5"); //  
	}
}
