package b.controlstatements;

public class JNestedForLoop {

	public static void main(String[] args) 
	{

//		for(int row=1;row<=3;row++)  // rows
//		{
//		 for(int col=1;col<=3;col++) // columns
//		 {
//		   System.out.print(col + " ");
//		 }
//		 System.out.println();
//		}
		
		
		for(int row=1;row<=3;row++)  // rows
		{
		 for(int col=1;col<=row;col++) // columns
		 {
		   System.out.print("* ");
		 }
		 System.out.println();
		}

	}

}
