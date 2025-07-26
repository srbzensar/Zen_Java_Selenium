package controlstatements;

public class ForLoopBreak {

	public static void main(String[] args) {

		String name = "Sachin Tendulkar";
//		System.out.println(name);
		
		for(int i=0;i<name.length();i++)
			System.out.print(name.charAt(i) + " ");
		
		
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
		
		
//		print all characters but n
		
		
		
	}

}
