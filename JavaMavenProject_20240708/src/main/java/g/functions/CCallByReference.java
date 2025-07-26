package g.functions;

public class CCallByReference {

	
	public static void update(int a[])
	{
		a[0] *= 1.1;
		System.out.println("Value of a in function: " + a[0]);
	}
	
	public static void main(String[] args) {
		
		int a[] = {100};
		
		System.out.println("a before update: " + a[0]);
		update(a);
		System.out.println("a after update: " + a[0]);
		
		
		
		
	}

}
