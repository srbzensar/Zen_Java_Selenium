package g.functions.lambda;

import java.util.function.Function;



public class ALambdaSquare {

	
	static Function<Integer, Integer> square = x -> x * x;
	
	public static void main(String[] args) 
	{
//		Function<Integer, Integer>: functional interface (1 i/p, 1 o/p)
//				i/p type, return type
		int n=5;
		System.out.println("square of " + n + " is " + square.apply(n));
	}

}
