package oop.polymorphism;

public class Calculator {

	public int add(int x, int y)
	{
		return x + y;
	}
	
	public int add(int x, int y, int z)
	{
		return x + y;
	}
	
	public double add(double x, double y)
	{
		return x + y;
	}
	
	public static void main(String[] args) 
	{
		Calculator c = new Calculator();
		
		System.out.println(c.add(5, 10));
		System.out.println(c.add(5.5, 10.5));
		
	}

}
