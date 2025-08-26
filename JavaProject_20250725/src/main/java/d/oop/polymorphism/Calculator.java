package d.oop.polymorphism;

/*
Method overloading: more than one methods with the same name, in the same class
number of args: varies
type of args: varies 

compile time polymorphism


we cannot achieve method overloading using return type
*/


public class Calculator {
	
	public static int add(int a, int b)
	{
		return a + b;
	}
	
//	we cannot achieve method overloading using return type
//	public static double add(int a, int b)
//	{
//		return a + b;
//	}
	
//	number of args is changed
	public static int add(int a, int b, int c)
	{
		return a + b + c;
	}
	
//	data type of args is changed
	public static double add(double a, double b)
	{
		return a + b;
	}
	
//	data type of args is changed
	public static double add(int a, double b)
	{
		return a + b;
	}
	
	public static void main(String[] args) 
	{
		int a = 5, b = 10, c = 20;
		double x=3.4, y=4.5;
		
		System.out.println(add(a, b));
		System.out.println(add(a, b, c));
		System.out.println(add(x, y));
		System.out.println(add(50, 100));
		
	}
}
