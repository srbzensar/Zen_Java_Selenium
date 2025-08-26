package b.controlstatements;

public class ADrivingLicenseIf {

	public static void main(String[] args) {

		int age = 52;
		
//		if(age>=18) // true/ false
//		{
//			System.out.println("Driving license is issued");
//		}
//		else
//		{
//			System.out.println("Driving license is not applicable below 18 years");
//		}
		
//		if(age>=18) // true/ false
//			System.out.println("Driving license is issued");
//		else
//		{
//			System.out.println("Need to wait");
//			System.out.println("Driving license is not applicable below 18 years");
//		}	
		
//		ternary operator ?:
//		condition?true:false
		String r;
		int n = 22;
		
//		challenge: print if n is even or odd
//		if(n%2==0)
//			System.out.println("even");
//		else
//			System.out.println("odd");
//		
//		if(age>=40)
//			System.out.println("fitment certificate needed");
//		else if(age>=18) 
//			System.out.println("Driving license is issued");
//		else
//		{
//			System.out.println("Need to wait");
//			System.out.println("Driving license is not applicable below 18 years");
//		}	
		
//		nested if
		
		age = 22;
		int wt = 60;
		
//		age >=18		wt >=50   : for blood donation
//		if(age >= 18)
//		{
//			if(wt >= 50)
//				System.out.println("eligible for blood donation");
//			else
//				System.out.println("Not eligible for blood donation");
//		}
//		else
//			System.out.println("Not eligible for blood donation");
		
//		Logical operator (AND > && both conditions must match)
//		if(age >= 18 && wt >= 50)
//			System.out.println("eligible for blood donation");
//		else
//			System.out.println("Not eligible for blood donation");
		
//		Logical operator (OR > || any one condition should match)
		if(age >= 18 || wt >= 50)
			System.out.println("eligible for blood donation");
		else
			System.out.println("Not eligible for blood donation");
		
		
		
		System.out.println("Thanks for using the service");
		
	}

}
