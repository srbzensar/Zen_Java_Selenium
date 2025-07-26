package b.controlstatements;

import java.util.Scanner;

public class IDoWhileLoop {

	public static void main(String[] args) {

////		table of a number
//		  int num= 17;
//		   for (int i=1; i <=10;i++)
//		    {
//			    System.out.println(num + " * " + i + " = " + (num*i));
//			}
		   
		// take a number from user and print it, until the user enters number 0

		    Scanner sc = new Scanner(System.in);	
			int input;	
			
		    
//		    input = sc.nextInt();
//		    while(input!=0)
//		    {
//		        System.out.println("Please enter a number ");
//		        input = sc.nextInt();
//		        System.out.println("you entered" + input);
//		    }
		    
			do
		    {
		        System.out.println("Please enter a number: ");
		        input = sc.nextInt();
		        System.out.println("you entered " + input);
		    }while(input!=0);
		    

	}

}
