package e.functions;

public class PatternRecursion {

	
	public static void columns(int n)
	{
		System.out.print("* ");
		if(n==1)
			return;
		else
			columns(n-1);
	}
	
	public static void pattern(int n)
	{
		columns(n);
		if(n==1)
			return;
		else
			System.out.println();
		pattern(n-1);
	}
	
	public static void main(String[] args) {

		int n=3;
		pattern(n);
	}
}
