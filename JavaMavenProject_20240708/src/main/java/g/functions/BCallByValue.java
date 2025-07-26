package g.functions;

public class BCallByValue {

	
	public static void update(int a)
	{
		a*=1.1;
		System.out.println("Value of a in function: " + a);
	}
	
	public static void main(String[] args) {
		
		int a = 100;
		System.out.println("a before update: " + a);
//		update(a); // call by value
		update(100);
		System.out.println("a after update: " + a);

	}

}
