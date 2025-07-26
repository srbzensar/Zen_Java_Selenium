package g.functions;

public class AFactorialRecursion {

	public static int fact(int n)
	{
		if(n==1)
			return 1;
		else
			return n*fact(n-1);
	}
	
	
	public static void main(String[] args) {
		
		int a=5;
		System.out.println("Factorial of 5 is: " + fact(5));

	}

}
