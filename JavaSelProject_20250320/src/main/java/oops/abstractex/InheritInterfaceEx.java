package oops.abstractex;

interface Printable
{
	int holidays = 10;
	void print();
	
 ////	concrete method supported in interface?
//	public void a()
//	{
//		
//	}
	
	default void b()
	{
		System.out.println("method b: Printable");
	}
	
	public static void display()
	{
		System.out.println("static display: P");
	}
	
}

//interface Showable extends Printable
//{
//	void show();
//}
interface Showable 
{
	int holidays = 15;
	
	void print();
	void show();
	
	default void b()
	{
		System.out.println("method b: Showable");
	}
	
	public static void display()
	{
		System.out.println("static display: S");
	}
}


//public class InheritInterfaceEx implements Showable{
//
//	
//	@Override
//	public void print() {
//		System.out.println("print");
//	}
//
//	@Override
//	public void show() {
//		System.out.println("show");
//	}
//	
//	public static void main(String[] args) {
//		InheritInterfaceEx obj = new InheritInterfaceEx();
//		obj.print();
//		obj.show();
//		
//	}
//
//
//}
public class InheritInterfaceEx implements Showable, Printable{

	
	@Override
	public void print() {
		System.out.println("print");
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
		InheritInterfaceEx obj = new InheritInterfaceEx();
		obj.print();
		obj.show();
		
		obj.b();
		
		Printable.display();
		Showable.display();
		
//		System.out.println(Printable.holidays);
		System.out.println(Showable.holidays);
		
	}


}
