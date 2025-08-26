package functions.lambda;

import java.util.function.BiFunction;

public class LambdaSum {

	public static void main(String[] args) {

//		BiFunction<Input, Input, output> functional interface (2 inputs)
		
		BiFunction<Integer,Integer,Integer> sum = (x, y) -> x + y;
		
		int n=5, p=10;
		System.out.printf("%d + %d is %d",n, p, sum.apply(n, p));
		
	}

}
