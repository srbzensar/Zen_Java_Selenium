package b.controlstatements;

public class HwhileLoopInfiniteLoop {

	public static void main(String[] args) 
	{
		String name = "Sachin Tendulkar";
			
		int i = 0;
////		infinite while loop
//		while(true)
//		{
//			System.out.println(i);
//			i++;
//		}
		
		
//		infinite while loop with break
		while(true)
		{
			if(name.charAt(i) == 'r')
				break;
			System.out.println(name.charAt(i));
			i++;
		}
		
	}

}
