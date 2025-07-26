package basics;

import java.util.Scanner;

public class UserInputs {

	public static void main(String[] args) {

//		int a = 10;
//		String s1 = "Sachin";
		
		String s2 = new String("Virat");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your age: ");
		
		int age;
		age = sc.nextInt();
		System.out.println("Great you are " + age);
		
		double wt;
		String name;
		char working;
		
		System.out.println("Please enter your weight");
		wt = sc.nextDouble();
		
		System.out.println("Please enter your name");
		name = sc.next();
		
		System.out.println("are you working(y/n)");
		working = sc.next().charAt(0);
		
		sc.close();
	}

}
