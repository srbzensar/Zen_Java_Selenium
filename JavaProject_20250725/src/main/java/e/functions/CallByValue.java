package e.functions;

public class CallByValue {

	public static void update(int b)
	{
		b*=1.1;
//		System.out.println(b); // 110	
	}
	
	public static void main(String[] args) 
	{
		int a = 100;
		System.out.println("a before update: " + a); 
		update(a);	
		System.out.println("a after update: " + a); // 100 
	}

}
