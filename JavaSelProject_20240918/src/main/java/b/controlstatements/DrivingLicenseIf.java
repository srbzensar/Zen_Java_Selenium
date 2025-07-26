package b.controlstatements;

public class DrivingLicenseIf {

	public static void main(String[] args) {

		
		int age = 8;
		
//		if cond
//		if(age>=18)
//		{
//			System.out.println("Driving license issued");
//		}
		
////		if else
//		if(age>=18)
//		{
//			System.out.println("Driving license issued");
//		}
//		else
//			System.out.println("need to wait");
//			System.out.println("thanks");
		
		
////	if else
//	if(age>=18)
//	{
//		System.out.println("Driving license issued");
//	}
//	else
//	{
//		System.out.println("need to wait");
//		System.out.println("Min age is 18");
//	}
//	
//	System.out.println("thanks");
	
	
//	int number = 50;
//	if (number%2==0)
//		System.out.println("number is even");
//	else
//		System.out.println("number is odd");
	
	
////	Ternary operator cond?true:false
//	String r;
//	r = (number%2==0)?"even number":"odd number";
//	System.out.println(r);
	
////	if else ladder
//		if(age>=40)
//			System.out.println("fitment cert needed");
//		else if(age>=18)
//		{
//			System.out.println("Driving license issued");
//		}
//		else
//		{
//			System.out.println("need to wait");
//			System.out.println("Min age is 18");
//		}	
		
//		nested if
		if(age>=18)
		{
			if(age>=40)
			{
				System.out.println("fitment cert needed");
			}
			else
			{
				System.out.println("Driving license issued");
			}
		}	
		else
		{
			System.out.println("need to wait");
			System.out.println("Min age is 18");
		}	
	
	}

}
