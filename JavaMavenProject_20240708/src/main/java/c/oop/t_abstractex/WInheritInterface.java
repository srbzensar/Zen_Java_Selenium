package c.oop.t_abstractex;

interface Printablee
{
	int holidays = 10;
	void print();
}

interface Showablee extends Printablee
{
	void show();
}

class WInheritInterface implements Showablee 
{

	@Override
	public void print() {
		System.out.println("print");
		
	}

	@Override
	public void show() {
		System.out.println("show");		
	}
	
	public static void main(String[] args) {
		WInheritInterface obj = new WInheritInterface();
		obj.print();
		obj.show();
	}
	
}