package b.contorlstatements;

public class ForLoopContinue {

	public static void main(String[] args) {

		String name = "Sachin Tendulkar";
		
//		System.out.println(name);
		
//		for(int i=0;i<name.length();i++)
//		{
//			if(name.charAt(i) != 'n')
//				System.out.print(name.charAt(i) + " ");
//		}
//		or
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i) == 'n') // name[i]
				continue;
			System.out.print(name.charAt(i) + " ");
		}
	
		
	}

}
