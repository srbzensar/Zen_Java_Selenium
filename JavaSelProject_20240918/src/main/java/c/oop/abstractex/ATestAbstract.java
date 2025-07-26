package c.oop.abstractex;

abstract class Shape
{
	 abstract void draw();
	
	 void calcArea()
	 {
		 System.out.println("Calculating area of a Shape");
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
		
//		Shape s = new Shape();  //  (can't instantiate abstract class)
		
		Circle c = new Circle();
		c.draw();
//		c.calcArea();
		
		UpperTriangle u = new UpperTriangle();
		u.draw();
		
		LowerTriangle l = new LowerTriangle();
		l.draw();
		
		
		
		
	}

}
