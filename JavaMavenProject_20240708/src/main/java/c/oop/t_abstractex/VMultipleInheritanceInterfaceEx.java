package c.oop.t_abstractex;


interface Printable
{
	
	public void print();
	
	
	public void p(int a);
	
////	concrete method not supported in interface
//	public void a()
//	{
//		
//	}
	
////	concrete method not supported in interface
//	default void b()
//	{
//		
//	}
	
//	public static void display()
//	{
//		
//	}
	
}

interface Showable
{
	
	public void show();
	public void print();
	
}




public class VMultipleInheritanceInterfaceEx implements Printable, Showable 
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
	public void p(int a) {
		System.out.println("number " + a);
	}
	
	public static void main(String[] args) {
		VMultipleInheritanceInterfaceEx o = new VMultipleInheritanceInterfaceEx();
		o.print();
		o.show();
		
	}

	

	
	
}