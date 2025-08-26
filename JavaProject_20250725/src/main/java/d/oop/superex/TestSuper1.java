package d.oop.superex;

class Animal
{
	String color = "black";
	
	void eat(){System.out.println("eating...");}
}

class Dog extends Animal
{
	String color = "white";
	
	@Override
	void eat(){System.out.println("eating bread...");}
	
	void printColor()
	{
		System.out.println(color); // w 
		System.out.println(super.color); // B 
	}
	
	void work()
	{
		eat(); // EB
		super.eat(); // E
	}
}

public class TestSuper1 
{
	public static void main(String[] args) 
	{
		Dog d = new Dog();
		d.printColor();
		
		d.work();
	}
}

