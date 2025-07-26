package c.oop.abstractex;

// first team
interface Drawable
{
	void draw();
}


// another team
class Rectangle2 implements Drawable
{

	@Override
	public void draw() {
		System.out.println("drawing rectangle");
	}
	
}


//another team
class Circle2 implements Drawable
{

	@Override
	public void draw() {
		System.out.println("drawing circle");
	}
	
	
	
	
}



public class TestInterface1 {

	public static void main(String[] args) {
		
		
//		Drawable d = new Drawable();
//		
//		Circle2 c = new Circle2();
//		c.draw();
//		
//		
//		Rectangle r = new Rectangle();
//		r.draw();
		
//		------------------------------------
		Drawable d;
		d = new Circle2();
		d.draw();
		
		d = new Rectangle2();
		d.draw();
		
	}

}
