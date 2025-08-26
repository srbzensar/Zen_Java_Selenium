package functions.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterEx {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);
		
		List<Integer> evenNumbers = 
				numbers.stream()
				.filter(n->n%2==0)
				.collect(Collectors.toList());
		
		System.out.println("numbers: " + numbers);
		System.out.println("even numbers: " + evenNumbers);
//		---------------------------------------------
		
		List<Integer> squareNumbers = 
				numbers.stream()
				.map(n->n*n)
				.collect(Collectors.toList());
		
		System.out.println("Square numbers: " + squareNumbers);
		
//		-----------------------------------------
//		challenge: square of even numbers
		
		List<Integer> squaredEvenNumbers = 
				numbers.stream()
				.filter(n->n%2==0)
				.map(n->n*n)
				.collect(Collectors.toList());
		
		System.out.println("Squared Even Numbers: " + squaredEvenNumbers);
		
//		-----------------------------------------
//		challenge: square of even numbers and other numbers as it is
		
		List<Integer> squaredEvenOddNumbers = 
				numbers.stream()
				.map(n->(n%2==0)?n*n:n)
				.collect(Collectors.toList());
		
		System.out.println("Squared Even Numbers and Odd: " + squaredEvenOddNumbers);

		
	}

}
