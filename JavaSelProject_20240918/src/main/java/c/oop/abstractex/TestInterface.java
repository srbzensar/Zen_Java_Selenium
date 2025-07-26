package c.oop.abstractex;

// first team
interface Drawable
{
	void draw();
}


// another team
class Rectangle implements Drawable
{

	@Override
	public void draw() {
		System.out.println("Drawing Rectangle");
	}
	
}

// Another team
class Square implements Drawable
{

	@Override
	public void draw() {
		System.out.println("Drawing Square");		
	}
	
}

public class TestInterface {

	public static void main(String[] args) {
		Drawable d;
		d = new Rectangle();
		d.draw();
		
		d = new Square();
		d.draw();
//		------------------------
		/*
		 * WebDriver driver;
		 * 
		 * driver = new ChromeDriver();
		 * 
		 * 
		 * driver = new FirefoxDriver();
		 */
		
		
		
		
	}

}
