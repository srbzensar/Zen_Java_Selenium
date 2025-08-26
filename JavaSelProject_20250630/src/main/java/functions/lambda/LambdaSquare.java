package functions.lambda;

import java.util.function.Function;

public class LambdaSquare {

	public static void main(String[] args) {

//		Function<Integer, Integer> functional interface (1 i/p, 1 o/p)
//				input type,output type
		
		Function<Integer,Integer> square = x -> x * x;
		
		Function<Integer,Integer> cube = x -> x * x * x;
		
		int n=5;
		int r = square.apply(n);
//		System.out.printf("square of %d is %d",n, square.apply(n));
		System.out.println("square of " + n + " is " + r);
		System.out.println("cube of " + n + " is " + cube.apply(n));
		
	}

}
