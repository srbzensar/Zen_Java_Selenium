package oop.interfaceex;

/*
Java8 onwards
Interface can have abstract methods, however it's optional.
It cannot have a concrete method; can include default/ static methods.

*/
interface Printable
{
	public void print();
	
	default void startPrinting()
	{
		System.out.println("Printing started");
	}
	
	static void troubleShoot()
	{
		System.out.println("Auto-troubleshooting in progress");
	}
	
	
}


interface Showable
{
	public void show();
	public void print();
}

public class MultipleInheritance implements Printable, Showable{


	@Override
	public void show() {
		System.out.println("show");
	}

	@Override
	public void print() {
		System.out.println("print");
	}

	public static void main(String[] args) {
		MultipleInheritance obj = new MultipleInheritance();
		obj.print();
		obj.show();
		
//		obj.startPrinting();
//		Printable.troubleShoot();
	}
}
