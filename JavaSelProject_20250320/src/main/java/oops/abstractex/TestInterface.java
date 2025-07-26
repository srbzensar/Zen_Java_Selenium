package oops.abstractex;

// First team
interface Drawable
{
	void draw();
}

// Another team
class Rectangle implements Drawable
{

	@Override
	public void draw() {
		System.out.println("Drawing Rectangle");
	}	
}

//Another team
class Square implements Drawable
{

	@Override
	public void draw() {
		System.out.println("Drawing Square");
	}	
}



public class TestInterface {

	public static void main(String[] args) {
//		Rectangle r = new Rectangle();
//		r.draw();
//		
//		Square s = new Square();
//		s.draw();
		
		Drawable d;
		d = new Rectangle(); // upcasting
//		d = new Square();		
		
		d.draw();
		
		/*
		 * WebDriver is an interface
		 * ChromeDriver, EdgeDriver and FirefoxDriver are classes: implmented WebDriver
		 * 
		 * WebDriver driver;
		 * driver = new ChromeDriver();
		 * 
		 * driver = new EdgeDriver();
		*/
		
	}

}
