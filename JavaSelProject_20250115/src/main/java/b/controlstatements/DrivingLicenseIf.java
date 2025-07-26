package b.controlstatements;

public class DrivingLicenseIf {

	public static void main(String[] args) {

		int age = 25;
//		
////		if(age>=18)
////		{
////			System.out.println("Driving license issued");
////		}
//		
////		if(age>=18)
////		{
////			System.out.println("Driving license issued");
////		}
////		else
////			System.out.println("Need to wait");
////			System.out.println("Thank you"); // not part of else
//		
//		
//		if(age>=18)
//		{
//			System.out.println("Driving license issued");
//		}
//		else
//		{
//			System.out.println("Need to wait");
//			System.out.println("Thank you"); 
//		}
		
//		challenge
		int number = 10;
//		if(number%2 == 0)
//			System.out.println("Even number");
//		else
//			System.out.println("odd number");
		
//		Ternary operator ?:
//		condition?true?false
		
//		String r;
//		r = (number%2==0)?"even number":"odd number";
//		System.out.println(r);
		
//		if else ladder
//	age = 15; 
//	if(age>=40)
//	{
//		System.out.println("Fitment certificate is needed");
//	}
//	else if(age>=18)
//	{
//		System.out.println("Driving license issued");
//	}
//	else
//		System.out.println("Need to wait");
//	
//	
//	System.out.println("Thank you"); // not part of else

//		-------------------------
//		nested if
		
		age = 10;
		int weight = 30;
//		age>=18 and weight>50
//		if(age>=18)
//		{
//			if(weight>50)
//			{
//				System.out.println("You are eligible to donate blood");
//			}
//		}
		
//		-----------------------------
//		logical operator (and condition)
//		if(age>=18 && weight>50)
//		{
//			System.out.println("You are eligible to donate blood");
//		}
//		else
//			System.out.println("You are NOT eligible to donate blood");
		
//		--------------------
//		or condition
		if(age>=18 || weight>50)
		{
			System.out.println("You are eligible to donate blood");
		}
		else
			System.out.println("You are NOT eligible to donate blood");
		
		
	}

}
