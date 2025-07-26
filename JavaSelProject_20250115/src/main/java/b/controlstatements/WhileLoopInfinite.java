package b.controlstatements;

public class WhileLoopInfinite {

	public static void main(String[] args) {

		String name = "Sachin Tendulkar";
		
//		int i = 0;
//		while(true)
//		{
//			System.out.println(i);
//			i++;
//		}
		
		int i = 0;
		while(true)
		{
			System.out.println(i);
			if(i==10)
				break;
			i++;
		}
		
	}

}
