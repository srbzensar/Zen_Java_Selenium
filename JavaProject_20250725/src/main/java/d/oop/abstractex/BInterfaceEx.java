package d.oop.abstractex;


interface Drawable {
	void draw(); // method is by default abstract
}

class Rectangle implements Drawable 
{
	@Override
	public void draw() {
		System.out.println("Drawing Rectangle");
		
	}
}

class Square implements Drawable 
{
	@Override
	public void draw() {
		System.out.println("Drawing Square");
		
	}
}


public class BInterfaceEx {

	public static void main(String[] args) {
		Drawable d;
		d = new Rectangle();
		d.draw();
		
		d = new Square();
		d.draw();
		
//		Drawable x = new Drawable(); 
		
	}
}
