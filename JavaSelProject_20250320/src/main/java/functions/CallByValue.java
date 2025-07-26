package functions;

public class CallByValue {

	public static void update(int a)
	{
		a*=1.1;
	}
	
	public static void main(String[] args) {

		int a = 100;
		System.out.println("a before update: " + a);
		
		update(a);
		System.out.println("a after update: " + a);
		
	}

}
