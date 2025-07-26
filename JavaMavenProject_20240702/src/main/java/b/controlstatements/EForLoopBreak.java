package b.controlstatements;

public class EForLoopBreak {

	public static void main(String[] args) 
	{
//		String name = "Sachin";
		String name = "Sachin Tendulkar";
			
//		System.out.println(name);
		
//		for(int i=0;i<=5;i++)
//		{
//			System.out.print(name.charAt(i) + " ");
//		}
		
//		for(int i=0;i<6;i++)
//		{
//			System.out.print(name.charAt(i) + " ");
//		}

		for(int i=0;i<name.length();i++)
		{
			System.out.print(name.charAt(i) + " ");
		}
		
////		String index out of range: 16
//		for(int i=0;i<=name.length();i++)
//		{
//			System.out.print(name.charAt(i) + " ");
//		}
		System.out.println();
		for(int i=0;i<name.length();i++)
		{
			char ch = name.charAt(i);
			if(ch == 'n')
			{
				System.out.println(ch + " found" + " at index " + i);
				break;
			}
		}
		
		
	}

}
