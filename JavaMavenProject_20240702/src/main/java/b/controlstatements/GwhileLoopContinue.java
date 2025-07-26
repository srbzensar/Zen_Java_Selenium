package b.controlstatements;

public class GwhileLoopContinue {

	public static void main(String[] args) 
	{
		String name = "Sachin Tendulkar";
			
//		System.out.println(name);
		
//		int i=0;
//		while(i<name.length())
//		{
//			System.out.print(name.charAt(i) + " ");
//			i++;
//		}
		
////		break out of the loop if n occurs in the string
//		int i=0;
//		while(i<name.length())
//		{
//			char ch = name.charAt(i);
//			if(ch == 'n')
//				break;
//			System.out.print(ch + " ");
//			i++;
//		}
		
//		continue with the next iteration if n occurs in the string
		int i=0;
		while(i<name.length())
		{
			char ch = name.charAt(i);
			if(ch == 'n')
			{
				i++;
				continue;
			}
			System.out.print(ch + " ");
			i++;
		}
		
	}

}
