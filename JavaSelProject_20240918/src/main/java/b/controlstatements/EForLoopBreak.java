package b.controlstatements;

public class EForLoopBreak {

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
