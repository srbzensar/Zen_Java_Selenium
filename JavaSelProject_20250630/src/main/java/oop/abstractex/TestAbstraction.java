package oop.abstractex;

/*
//An abstract class can contain, zero or more abstract methods, 
//however if there's an abstract method in a class, the class must be abstract.

An Abstract class cannot be instantiated (can't create the object)


*/
// abstract class
abstract class Shape
{
	abstract void draw(); // abstract method
	
//	concrete method
	void calcArea()
	{
		System.out.println("Calculating Area of a Shape");
	}
	
}

// concrete class
class Rectangle extends Shape
{

	@Override
	void draw() {
		System.out.println("Drawing Rectangle");
	}
	
}

abstract class Circle extends Shape 
{
	
}

class BigCircle extends Circle
{

	@Override
	void draw() {
			System.out.println("Drawing Big Circle");
	}
	
}

class SmallCircle extends Circle
{

	@Override
	void draw() {
			System.out.println("Drawing Small Circle");
	}
	
}

public class TestAbstraction {

	public static void main(String[] args) {
//		Shape s = new Shape();  // An Abstract class cannot be instantiated
		
//		Rectangle r = new Rectangle();
//		r.draw();
//		
//		BigCircle b = new BigCircle();
//		b.draw();
//		
//		SmallCircle s = new SmallCircle();
//		s.draw();
		
		Shape s;
		s = new Rectangle();
		s.draw();
		
		s = new BigCircle();
		s.draw();
		
		/*		
				ChromeDriver driver = new ChromeDriver();
				
				WebDriver driver;
				driver = new ChromeDriver();
		*/		
	}

}
