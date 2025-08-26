package c.oop.inheritance.extra;

/*
Method overloading: more than one methods with the same name, in the same class
number of args: varies
type of args: varies 

we cannot achieve method overloading using return type
*/
public class Calculator {

	public static int add(int a, int b)
	{
		return a + b;
	}

//	number of arg: changed
	public static int add(int a, int b, int c)
	{
		return a + b + c;
	}
	
//	data type of arg: changed
	public static double add(double a, double b)
	{
		return a + b;
	}
	
//	we cannot achieve method overloading using return type
//	public static double add(int a, int b)
//	{
//		return a + b;
//	}
	
	public static void main(String[] args) {
		int a = 5, b = 10, c = 20;
		
		System.out.println(add(a, b));
		System.out.println(add(a, b, c));
		System.out.println(add(2.5, 3.5));
	}
	
}
