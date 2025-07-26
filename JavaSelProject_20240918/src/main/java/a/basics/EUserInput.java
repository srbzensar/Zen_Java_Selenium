package a.basics;

import java.util.Scanner;

public class EUserInput {

	public static void main(String[] args) {
//		int a = 10;
//		String s1 = "Sachin";
		String s2 = new String("Virat");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your age");
		int age;
		double wt;
		String name;
		char working; // w, n
		
		age = sc.nextInt();
		System.out.println("Great you are " + age);
		
		System.out.println("Please enter your weight");
		wt = sc.nextDouble();
		
		System.out.println("Please enter your name");
		name = sc.next();
//		
////		no method for nextChar()
		System.out.println("are you working(y/n)");
		working = sc.next().charAt(0);
		
		sc.close();  
		
		
	}

}
