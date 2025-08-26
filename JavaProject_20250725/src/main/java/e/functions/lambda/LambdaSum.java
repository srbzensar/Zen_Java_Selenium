package e.functions.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class LambdaSum {

	public static void main(String[] args) 
	{
//		BiFunction<input, input, output>: functional interface: 2 inputs
//				
		BiFunction<Integer, Integer, Integer> sum = (x, y) -> x + y;
		
		int a=5, b=10;
		System.out.println(String.format("%d + %d is %d", a, b, sum.apply(a, b)));
	}

}
