package a.basics;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int age;
		double wt;
		String name;
		char working;
		
		System.out.println("Please enter your age ");
		age = sc.nextInt();
		System.out.println("Great! you are " + age);
		

		System.out.println("Please enter your weight ");
		wt = sc.nextDouble();
		
		System.out.println("Please enter your name ");
		name = sc.next();
		
//		no method for nextChar()
		System.out.println("Are you working(y/n) ");
		working = sc.next().charAt(0);
		
		sc.close();
	}
}
