package controlstatements;

public class ForLoopContinue {

	public static void main(String[] args) {

		String name = "Sachin Tendulkar";
//		System.out.println(name);
		
		for(int i=0;i<name.length();i++)
			System.out.print(name.charAt(i) + " ");
		
		System.out.println();
		
//		for(int i=0;i<name.length();i++)
//		{
//			char ch = name.charAt(i);
//			if(ch != 'n')
//				System.out.print(ch + " ");
//		}
		
		
		System.out.println();
		for(int i=0;i<name.length();i++)
		{
			char ch = name.charAt(i);
			if(ch == 'n')
				continue;
			System.out.print(ch + " ");
		}
		
		
//		print all characters but n
		
//		------------------------------
//		Challenge: do both of these programs using while loop
//		1. find character n and 
//		2. skip character n
		
	}

}
