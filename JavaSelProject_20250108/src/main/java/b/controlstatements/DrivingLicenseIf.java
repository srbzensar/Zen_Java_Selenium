package b.controlstatements;

public class DrivingLicenseIf {

	public static void main(String[] args) {

		
		int age = 10;
		
//		if(age>=18)
//			System.out.println("Congrats!! Please collect your driving license");
		
//		if(age>=18)
//		{
//			System.out.println("Congrats!! Please collect your driving license"); // st 1
//		}
//		else
//		{
//			System.out.println("Need to wait"); // 2
//			System.out.println("Min age should be 18"); // 3
//		}
		
//		challenge: print if the number is even or odd
//		int number = 51;
//		if(number % 2 == 0)
//			System.out.println("Even Number");
//		else
//			System.out.println("odd number");
		
//		Ternary operator 
//		condition?true?false
		
//		String r = (number%2==0)?"even number":"odd number";
//		System.out.println(r);
//		----------------------
		
//		if else ladder
//		if(age>40)
//			System.out.println("Fitment cert needed");
//		else if(age>=18)
//		{
//			System.out.println("Congrats!! Please collect your driving license"); // st 1
//		}
//		else
//		{
//			System.out.println("Need to wait"); // 2
//			System.out.println("Min age should be 18"); // 3
//		}
//		--------------------------------------
		
//		nested if
		age = 20;
		int weight = 40;
		
//		if(age >= 18)
//		{
//			if(weight > 50)
//			{
//				System.out.println("You are eligible to donate blood");
//			}
//		}
		
//		--------------------------------
////		and condition (logical operator: result is true if both conditions are true)
//		if(age>=18 && weight>50)
//		{
//			System.out.println("You are eligible to donate blood");
//		}
		
		
//		or condition (logical operator: result is true if any one of the conditions is true)
		if(age>=18 || weight>50)
		{
			System.out.println("You are eligible to donate blood");
		}
		
		
		
	}

}
