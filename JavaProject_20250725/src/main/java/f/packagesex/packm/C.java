package f.packagesex.packm;

public class C {

	public static void show()
	{
		System.out.println("local static show");
	}
	
	
	public static void main(String[] args) {
		System.out.println("C");
		show();
//		C.show();
		B.show();
	}

}
