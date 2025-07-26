package controlstatements;

public class ForLoopBreak {

	public static void main(String[] args) {
		String name = "Sachin Tendulkar";
		
//		print it character by character separated by space using for loop
		
		
//		challenge: check if character 'n' is available in name
		
		
//		challenge: check how many times character 'n' is available in name
		int count = 0;
		for(int i=0;i<name.length(); i++)
		{
			if(name.charAt(i) == 'n')
				count++;
		}

		System.out.println("n is found " + count + " times");
		
//		challenge: print all character other than n
		for(int i=0;i<name.length(); i++)
		{
			if(name.charAt(i) == 'n')
				continue;
			System.out.println(name.charAt(i));
				
		}
		
//		1 2 3
//		1 2 3
//		1 2 3

//		* 
//		* * 
//		* * *

	}
}
