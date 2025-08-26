package e.functions.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterEx {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);
		
		List<Integer> evenNumbers = 
				numbers.stream()
				.filter(n->n%2 == 0)
				.collect(Collectors.toList());
		
		/*
numbers.stream() creates a stream from the list.
.filter(n -> n % 2 == 0) filters elements where the condition is true.
.collect(Collectors.toList()) gives a list of filtered elements.
		*/
		
		System.out.println("Numbers: " + numbers );
		System.out.println("Even Numbers: " + evenNumbers);
	}

}
