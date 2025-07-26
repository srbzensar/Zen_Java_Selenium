package arrays;

public class SimpleArrayMultiD {

	public static void main(String[] args) 
	{

		int a[][] = new int[3][3]; // declaration, instantiation
		
		int v=1;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]= v++;
			}
		}
		
		for(int i=0;i<a.length;i++)  // row
		{
			for(int j=0;j<a[i].length;j++) // column
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
