package controlstatements;

public class DrivingLicenseIf {

	public static void main(String[] args) {
		int age = 20;
		
		
//		if(age >= 18)
//		{
//			System.out.println("Driving lic issued");
//		}
		
//		or
		
//		if(age >= 18)
//			System.out.println("Driving lic issued");
//		--------------------------
//		age = 17;
//		if(age >= 18)
//		{
//			System.out.println("Driving lic issued");
//		}
//		else
//		{
//			System.out.println("Sorry, Driving can not be issued");
//		}
		
//		if(age >= 18)
//			System.out.println("Driving lic issued");
//		else
//			System.out.println("Sorry, Driving can not be issued");

////	Ternary operator ?:
////		condition?true:false
//		String result;
//		result = (age%2==0)?"even number":"odd number";
//		System.out.println(result);
		
//		if else ladder
//		if(age >= 40)
//			System.out.println("Fitness cert needed");
//		else if(age >= 18)
//			System.out.println("Driving lic issued");
//		else
//			System.out.println("Sorry, Driving can not be issued");
		
		age = 43;
		if(age >=18)
		{
			if(age >= 40)
				System.out.println("Fitness cert needed");
			else
				System.out.println("Driving lic issued");
		}
		else
		{
			System.out.println("Sorry, Driving can not be issued");
			System.out.println("Minimum age should be 18");
		}
	}

}
