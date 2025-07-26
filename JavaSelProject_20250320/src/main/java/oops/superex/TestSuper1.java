package oops.superex;

class Animal
{
	String color = "black";
	
	void eat() {System.out.println("eating...");}
}

class Dog extends Animal
{
	String color = "white";
	
	void eat() {System.out.println("eating bread...");}
	
	void printColor()
	{
		System.out.println(color); 
		System.out.println(super.color); // color of Animal class
	}
	
	void work()
	{
		eat();
	}
}

public class TestSuper1 {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.printColor();
		
		d.work();
	}

}
