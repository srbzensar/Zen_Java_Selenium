package oop.interfaceex;


interface Printablee
{
	int holidays = 10;
	void print();
}

interface Showablee extends Printablee
{
	void show();
}

public class InheritInterface implements Showablee{

	@Override
	public void print() {
		System.out.println("print");
	}

	@Override
	public void show() {
		System.out.println("show");
	}

	public static void main(String[] args) {
		InheritInterface obj = new InheritInterface();
		obj.show();
		obj.print();
	}

}
