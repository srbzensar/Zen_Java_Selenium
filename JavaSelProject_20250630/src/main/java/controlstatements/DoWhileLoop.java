package controlstatements;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;
		
		do
		{
			System.out.println("Please enter a number: ");
			n = sc.nextInt();
			System.out.println("You entered " + n);
		}while(n!=0);
		System.out.println("Thanks");
	}

}
