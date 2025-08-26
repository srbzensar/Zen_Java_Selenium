package d.oop.abstractex;

interface Printable
{
	int holiday = 10;  // by default static and final
	public void print();
	
//	concrete method not supported in interface
//	public void a()	{
//		
//	}
	
//	default method supported
	default void b() {
		System.out.println("method b: Printable");
	}
	
//	static method supported
	public static void display()
	{
		System.out.println("static display: P");
	}
}

// interface inheritance
//interface Showable extends Printable
//{
//	void show();
//}


interface Showable 
{
	int holiday = 15;
	public void show();
	public void print();
	
	default void b() {
		System.out.println("method b: Printable");
	}
	
	public static void display()
	{
		System.out.println("static display: S");
	}
}



public class CInheritInterfaceEx implements Printable, Showable {

	@Override
	public void print() {
		System.out.println("Print");
	}
	
	@Override
	public void show() {
		System.out.println("show");
	}
	
	@Override
	public void b() {
//		Printable.super.b();
		Showable.super.b();
	}

	public static void main(String[] args) {
		CInheritInterfaceEx obj = new CInheritInterfaceEx();
		obj.print();
		obj.show();
		
		Printable.display();
		Showable.display();
		
		System.out.println(Printable.holiday);
		System.out.println(Showable.holiday);
		
//		Printable.holiday = 25; // not allowed to modify final property
		
	}
}
