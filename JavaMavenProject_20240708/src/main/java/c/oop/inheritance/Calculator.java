package c.oop.inheritance;

public class Calculator {

	public static int add(int a, int b) {
		return a + b;
	}
	
	public static int add(int a, int b, int c) {
		return a + b + c;
	}
	
	public static double add(double a, double b) {
		return a + b;
	}
	
	
	public static void main(String[] args) {
		int a=5, b=10, c=20;
		
		System.out.println(add(a, b));
		System.out.println(add(a, b, c));
		System.out.println(add(3.5, 4.5));

	}

	

}
