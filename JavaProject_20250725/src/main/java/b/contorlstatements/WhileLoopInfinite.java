package b.contorlstatements;

public class WhileLoopInfinite {

	public static void main(String[] args) {
		
		int i = 0;
		String name = "Sachin Tendulkar";
		
//		while(i<=10)
//		{
//			System.out.println(i);
//		}
		
		while(true)
		{
			if(name.charAt(i)=='n')
				break;
			System.out.println(name.charAt(i++));
		}
		
		
	}
	
}
