package b.controlstatements;

public class WhileLoopContinue {

	public static void main(String[] args) {
		int i=1;
		while(i<=20)
		{
			if(i%5 == 0)
			{
				i++;
				continue;
			}
				
			System.out.print(i + " ");
			i++;
		}
	}
}
