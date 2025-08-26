package a.basics;

/*
Author: Sunil
date: 29 July
The program is about taking user inputs
 
 */


import java.util.Scanner;

public class UserInputDemo {

	public static void main(String[] args) {
//		int a = 10;
//		String s1 = "Sachin";
//		String s2 = new String("Virat");
		
		Scanner sc = new Scanner(System.in);
		
		
		int age;
		String name;
		double wt;
		String workStatus;
		char working; // y, n
		
		System.out.print("Please enter your age ");
		age = sc.nextInt();
//		System.out.println("Great you are " + age);
		
		System.out.print("Please enter your name ");
		name = sc.next();
		
		System.out.print("Please enter your weight ");
		wt = sc.nextDouble();
		
		System.out.println("are you working(y/n) ");
//		workStatus = sc.next();
//		working = workStatus.charAt(0); // yes or y 
		
		working = sc.next().charAt(0);
		
		System.out.println("Hello " + name + ", with age " + age + ", and weight " + wt + " currently working? " + working);
		
		sc.close();
		
		
		
		
	}

}
