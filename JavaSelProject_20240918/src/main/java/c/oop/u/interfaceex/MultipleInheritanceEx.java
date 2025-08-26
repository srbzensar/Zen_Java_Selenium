package c.oop.u.interfaceex;

interface Printable
{
	
	int holiday = 10; // by default static and final
	public void absPrint(); // by default abstract
	
//	concrete method not supported in interface
//	public void a()
//	{
//	}
	
//	default method supported for backward compatibility: 
//	provide features without impacting classes, those have implemented the interface  
	default void defShow()
	{
		System.out.println("default show: Printable");
	}
	
//	supported
	public static void display()
	{
		System.out.println("static display: P");
	}
	
}

interface Showable
{
	int holiday = 15;
	public void absPrint();
	
	default void defShow()
	{
		System.out.println("default show: Showable");
	}
	
	public static void display()
	{
		System.out.println("static display: S");
	}
}


public class MultipleInheritanceEx implements Printable, Showable 
{
	// must override abstract method
	@Override
	public void absPrint() {	
		System.out.println("print");
	}

	// must override default method if available in both parents, otherwise not mandatory
	@Override
	public void defShow() {		
		Printable.super.defShow();
//		Showablee.super.defShow();
	}

	public static void main(String[] args) {
		MultipleInheritanceEx obj = new MultipleInheritanceEx();
		obj.absPrint();
		obj.defShow();
		
		Printable.display();
		Showable.display();
		
		System.out.println(Printable.holiday);
		System.out.println(Showable.holiday);
		
	}

}
