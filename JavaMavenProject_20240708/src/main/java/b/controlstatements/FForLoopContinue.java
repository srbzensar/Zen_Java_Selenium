package b.controlstatements;

public class FForLoopContinue {

	public static void main(String[] args) 
	{

		String name = "Sachin Tendulkar";
			


//		for(int i=0;i<name.length();i++)
//		{
//			if(name.charAt(i) == 'n')
//				continue;
//			System.out.print(name.charAt(i) + " ");
//		}
		
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i) == 'n' || name.charAt(i) == 'r')
				continue;
			System.out.print(name.charAt(i) + " ");
		}
		
		
	}

}
