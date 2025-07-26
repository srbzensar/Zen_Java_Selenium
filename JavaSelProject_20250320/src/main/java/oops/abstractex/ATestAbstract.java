package oops.abstractex;


abstract class Shape
{
	abstract void draw(); // abstract method
	
	void calcArea()
	{
		System.out.println("Calculating area of a shape");
	}
}

class Circle extends Shape
{

	@Override
	void draw() 
	{
		System.out.println("Drawing Circle");
	}
	
}

abstract class Triangle extends Shape
{
	
}

class UpperTriangle extends Triangle
{

	@Override
	void draw() {
		System.out.println("Draw Upper Triangle");
	}
	
}

class LowerTriangle extends Triangle
{
	
	@Override
	void draw() {
		System.out.println("Draw Lower Triangle");
	}
	
}

public class ATestAbstract {

	public static void main(String[] args) {
//		Shape s = new Shape();
		
		Circle c = new Circle();
		c.draw();
//		c.calcArea();
		
//		Triangle t = new Triangle(); // can't be instantiated
		
		UpperTriangle ut = new UpperTriangle();
		ut.draw();
		
		LowerTriangle lt = new LowerTriangle();
		lt.draw();
	}

}
