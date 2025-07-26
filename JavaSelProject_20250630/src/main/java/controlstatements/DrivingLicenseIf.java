package controlstatements;

public class DrivingLicenseIf {

	public static void main(String[] args) {

//		int age= 8;
		
//		if(age>=18)
//		{
//			System.out.println("Driving license issued");
//		}
		
//		if(age>=18)
//		{
//			System.out.println("Driving license issued");
//		}
//		else
//			System.out.println("need to wait");
//		
//		System.out.println("thanks");
			
//		if(age>=18)
//		{
//			System.out.println("Driving license issued");
//		}
//		else
//		{
//			System.out.println("need to wait");
//			System.out.println("You are not eligible for the license yet");
//		}
//		
//		System.out.println("thanks");
		
//		challenge: check if the number n is even or odd and print the message
//		int n = 50;
//		
//		if (n%2==0)
//			System.out.println("number is even");
//		else
//			System.out.println("number is odd");
		
//		Ternary operator ?:
//		condition?true:false
		
//		int n=5;
//		String r;
//		r = (n%2==0)?"even number":"odd number";
//		System.out.println(r);
		
//		if else ladder
//		1 to 10: "A", 11 to 20: "B", 21 to 30: "C", else "D"
//		int n=25;
//		if(n<=10)
//		{
//			System.out.println("A");
//		}
//		else if(n<=20)
//		{
//			System.out.println("B");
//		}
//		else if(n<=30)
//		{
//			System.out.println("C");
//		}
//		else
//		{
//			System.out.println("D");
//		}
		
		
//		age>=18		weight>50
		int age = 20;
		int wt = 40;
		
////		nested if
//		if(age>=18)
//		{
//			if(wt>50)
//			{
//				System.out.println("You are eligible to donate blood");
//			}
//		}
		
		
//		Logical operators (and condition)
		if(age>=18 && wt>50)
			System.out.println("You are eligible to donate blood");
		else
			System.out.println("You are NOT eligible to donate blood");
			
//		Logical operators (or condition): assumption any one criteria must match
		if(age>=18 || wt>50)
			System.out.println("You are eligible to donate blood");
		else
			System.out.println("You are NOT eligible to donate blood");
		
	}

}
