package b.controlstatements;

public class FForContinue {

	public static void main(String[] args) {
	
		String name = "Sachin Tendulkar";
		
	//	print all chars, but n 
		for(int i=0; i<name.length(); i++)
		{
			char ch = name.charAt(i);
			if(ch == 'n')
			{
				continue;
			}
			System.out.print(ch + " ");
		}
	}

}
