package e.functions;

public class CallByReference {

	public static void update(int b[])
	{
		b[0]*=1.1;
//		System.out.println(b); // 110	
	}
	
	public static void main(String[] args) 
	{
		int a[] = {100};
		System.out.println("a before update: " + a[0]); 
		update(a);	
		System.out.println("a after update: " + a[0]); // 100 
	}

}
