package c.oop.abstractex;

interface Printable
{
	int holidays = 10;
	void print();
}

interface showable extends Printable
{
	void show();
}


public class InheritInterfaceEx implements showable {

	

	@Override
	public void print() {
		System.out.println("Print");
	}

	@Override
	public void show() {
		System.out.println("Show");		
	}
	
	
	public static void main(String[] args) {
		InheritInterfaceEx obj = new InheritInterfaceEx();
		obj.print();
		obj.show();
	}

}
