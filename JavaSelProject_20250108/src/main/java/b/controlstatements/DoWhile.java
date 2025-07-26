package b.controlstatements;

import java.util.Scanner;

/*
Take a number from user and print it on the console, until user enters 0 
*/
public class DoWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input;
		
		do
		{
			System.out.println("Please enter a number: ");
			input = sc.nextInt();
			System.out.println("you have entered: " + input);
		}while(input!=0);
		System.out.println("Thanks");
	}

}
