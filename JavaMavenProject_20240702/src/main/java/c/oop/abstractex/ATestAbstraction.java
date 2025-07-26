package c.oop.abstractex;

// abstract class
abstract class Shape
{
	abstract void draw();
	
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
		System.out.println("drawing Rectangle");
	}
	
	

}

abstract class Circle extends Shape 
{

}

class BigCircle extends Circle
{

	@Override
	void draw() {
		System.out.println("Drawing Big circle");
		
	}
  	
}

class SmallCircle extends Circle
{

	@Override
	void draw() 
	{
		System.out.println("Drawing Small Circle");
		
	}
	
}



public class ATestAbstraction {

	public static void main(String[] args) {
//		Shape s = new Shape();  // cannot instantiate abstract class
		
//		Shape t = new Rectangle();
//		t.draw();
//		t = new BigCircle();
//		t.draw();
		
		
		Rectangle r = new Rectangle();
		r.draw();
		
		
		BigCircle b = new BigCircle();
		b.draw();
		
		SmallCircle s = new SmallCircle();
		s.draw();
		
		
	}

}
