package c.oop.u.interfaceex;

interface Readable
{
	void read();
}

interface Writable extends Readable
{
	void write();
}


public class CInheritInterfaceEx implements Writable {

	@Override
	public void read() {
		System.out.println("Reading");
	}

	@Override
	public void write() {
		System.out.println("Writing");		
	}
	
	
	public static void main(String[] args) {
		CInheritInterfaceEx obj = new CInheritInterfaceEx();
		obj.read();
		obj.write();
	}

}
