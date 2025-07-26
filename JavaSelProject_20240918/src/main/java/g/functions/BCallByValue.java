package g.functions;

public class BCallByValue {

	
	public static void update(int a)
	{
		a*=1.1;
	}
	
	public static void main(String[] args) {
		
		int a = 100;
		System.out.println("a before update: " + a);
		update(a);
//		update(100);
		System.out.println("a after update: " + a);

	}

}
