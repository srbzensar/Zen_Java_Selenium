package b.controlstatements;

public class WhileLoopBreak {

	public static void main(String[] args) {
		int i=1;
		while(i<=20)
		{
			if(i%5 == 0)
				break;
				
			System.out.print(i + " ");
			i++;
		}
	}
}
