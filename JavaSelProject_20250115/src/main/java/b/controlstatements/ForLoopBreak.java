package b.controlstatements;

public class ForLoopBreak {

	public static void main(String[] args) {

//		for(int i=1; i<=10; i++)    
//		{
//			System.out.print(i + " ");
//			if(i%5==0)
//				break; // break once the condition is true
//		}
//		System.out.println();
		
		int count = 0; // count even numbers from 1 to 10
		for(int i=1; i<=10; i++)    
		{
			System.out.print(i + " ");
			if(i%2==0)
				count++;
		}
		System.out.println("\nCount of even numbers: " + count);
		
		
		
	}

}
