package b.controlstatements;

public class BSwitchCase {

	public static void main(String[] args) {

		char ch = 'm';
		
//		if(ch == 'a')
//			System.out.println(ch + " is a vowel");
//		if(ch == 'e')
//			System.out.println(ch + " is a vowel");
//		if(ch == 'i')
//			System.out.println(ch + " is a vowel");
//		if(ch == 'o')
//			System.out.println(ch + " is a vowel");
//		if(ch == 'u')
//			System.out.println(ch + " is a vowel");
		
		switch(ch)
		{
		case 'a':
			System.out.println(ch + " is a vowel");
			break;
		case 'e':
			System.out.println(ch + " is a vowel");
			break;
		case 'i':
			System.out.println(ch + " is a vowel");
			break;
		case 'o':
			System.out.println(ch + " is a vowel");
			break;
		case 'u':
			System.out.println(ch + " is a vowel");
			break;
		default:
			System.out.println(ch + " is not a vowel");
		}
		System.out.println("Thank you");
		
	}

}
