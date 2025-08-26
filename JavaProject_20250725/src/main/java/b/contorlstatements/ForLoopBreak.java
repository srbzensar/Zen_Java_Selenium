package b.contorlstatements;

public class ForLoopBreak {

	public static void main(String[] args) {

		String name = "Sachin Tendulkar";
		
//		System.out.println(name);
		
		for(int i=0;i<name.length();i++)
		{
			System.out.print(name.charAt(i) + " ");
			if(name.charAt(i) == 'n')
				break;
		}
	
		
	}

}
