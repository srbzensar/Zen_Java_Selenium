package c.oop.abstractex;

interface Printablee
{
	
	int holiday = 10;
	public void print();
	
 //	concrete method not supported in interface
//	public void a()
//	{
//		
//	}
	
//	supported
	default void b()
	{
		System.out.println("method b: Printable");
	}
	
//	supported
	public static void display()
	{
		System.out.println("static display: P");
	}
	
}

interface Showablee
{
	int holiday = 15;
	public void show();
	public void print();
	
	default void b()
	{
		System.out.println("method b: Showable");
	}
	
	public static void display()
	{
		System.out.println("static display: S");
	}
}




public class VMultipleInheritanceInterfaceEx implements Printablee, Showablee 
{

	
	@Override
	public void show() {
		System.out.println("show");
	}

	@Override
	public void print() {
		System.out.println("print");
	}

	@Override
	public void b() {
		Printablee.super.b();
//		Showablee.super.b();
	}

	public static void main(String[] args) {
		VMultipleInheritanceInterfaceEx obj = new VMultipleInheritanceInterfaceEx();
		obj.print();
		obj.show();
		obj.b();
		
		Printablee.display();
		Showablee.display();
		
		System.out.println(Printablee.holiday);
		System.out.println(Showablee.holiday);
		
	}

}
