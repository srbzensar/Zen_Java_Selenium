package functions;

public class CallByReference {

	public static void update(int b[])
	{
		b[0]*=1.1; // a=(a*0.1)+a; // 110
		System.out.println("value of a in function: " + b[0]);
//		System.out.println(b);
	}
	
	public static void main(String[] args) {
		int a[] = {100};
		
		System.out.println("a before update: " + a[0]);
//		System.out.println(a);
		update(a); // call by reference
		
		System.out.println("a after update: " + a[0]); // 110  100 
		
//		int arr[] = {10, 20, 30};
//		System.out.println(arr);
	}

}
