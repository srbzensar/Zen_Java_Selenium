package c.oop.superex;

class Animal
{
	String color = "black";
}

class Dog extends Animal
{
	String color = "white";
	
	void printColor()
	{
		System.out.println(color); // color of Dog class
		System.out.println(super.color); // color of Animal class
		
	}
}


public class TestSuper1 {

	public static void main(String[] args) {

		Dog d = new Dog();
		d.printColor();
	}

}
