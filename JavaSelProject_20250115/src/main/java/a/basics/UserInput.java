package a.basics;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

		int a;
		String s1 = "Sachin";
		String s2 = new String("Virat");
		
		Scanner sc = new Scanner(System.in);
				
//		System.out.println("Please enter your age: ");
		int age;
		double wt;
		String name;
		char working;
		
//		age = sc.nextInt();
//		System.out.println("Great, your age is " + age);
//		
//		System.out.println("Please enter your weight: ");
//		wt = sc.nextDouble();
		
		System.out.println("Please enter your name: ");
		name = sc.next();
		
		System.out.println("are you working(y/n): ");
		sc.next().charAt(0);
	
		sc.close();
	}

}
