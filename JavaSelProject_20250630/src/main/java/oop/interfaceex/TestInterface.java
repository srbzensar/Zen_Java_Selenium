package oop.interfaceex;

/*
//An Interface can contain, zero or more abstract methods, 
An Interface cannot be instantiated (can't create the object)
*/

interface Drawable
{
	void draw();  // abstract keyword not required
}

class Rectangle implements Drawable
{

	@Override
	public void draw() {
		System.out.println("drawing rectangle");
	}
	
}

class Circle implements Drawable
{

	@Override
	public void draw() {

		System.out.println("drawing circle");
	}
	
}


public class TestInterface
{
	public static void main(String[] args) {
		/*
		 * Rectangle r = new Rectangle(); r.draw();
		 * 
		 * Circle c = new Circle(); c.draw();
		 */
	
		Drawable d;
		d = new Circle();
		d.draw();
		
		d = new Rectangle();
		d.draw();
		
	}
	
	
	
}