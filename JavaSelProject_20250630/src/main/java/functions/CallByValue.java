package functions;

public class CallByValue {

	public static void update(int a)
	{
		a*=1.1; // a=(a*0.1)+a; // 110
		System.out.println("value of a in function: " + a);
	}
	
	public static void main(String[] args) {
		int a = 100;
		System.out.println("a before update: " + a);
//		update(a); // call by value
		update(100); // call by value
		System.out.println("a after update: " + a);
		
//		int arr[] = {10, 20, 30};
//		System.out.println(arr);
	}

}
