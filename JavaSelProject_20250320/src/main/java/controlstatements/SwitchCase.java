package controlstatements;

public class SwitchCase {

	public static void main(String[] args) {

		char ch = 'm';
		
		switch(ch)
		{
		case 'a':
			System.out.println(ch + " is  a vowel");
			break;
		case 'e':
			System.out.println(ch + " is  a vowel");
			break;
		case 'i':
			System.out.println(ch + " is  a vowel");
			break;
		case 'o':
			System.out.println(ch + " is  a vowel");
			break;
		case 'u':
			System.out.println(ch + " is  a vowel");
			break;
		default:
			System.out.println(ch + " is not a vowel");
			System.out.println("Can you please cross check");
		}
		System.out.println("Thank you");
	}

}
