package g.functions;

public class DCallByValueVsReference {

	
//	public static void update(int b)
//	{
//		System.out.println(b);
//		b *= 1.1;
//		System.out.println("Value of a in function: " + b);
//	}
	
	public static void update(int a[])
	{
		System.out.println(a);
		a[0] *= 1.1;
		System.out.println("Value of a in function: " + a[0]);
	}
	
	public static void main(String[] args) {
		
		int b=10;
		int a[] = {100};
		
		System.out.println("a before update: " + a[0]);
//		update(b);
		update(a);
		System.out.println("a after update: " + a[0]);
		
//		System.out.println(b); // 10
//		System.out.println(a); // Ref 
		
		
	}

}
