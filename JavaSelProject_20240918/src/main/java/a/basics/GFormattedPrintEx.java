package a.basics;

public class GFormattedPrintEx {

	public static void main(String[] args) {
		
		int a = 10, b = 5;
		System.out.println(a + " + " + b + " is " + (a+b));
		System.out.println(String.format("%d + %d is %d", a, b, a + b));

		String s = String.format("%d + %d is %d", a, b, a + b);
		System.out.println(s);
	}
}
