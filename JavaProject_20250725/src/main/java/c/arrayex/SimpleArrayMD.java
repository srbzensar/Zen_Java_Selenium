package c.arrayex;

public class SimpleArrayMD {

	public static void main(String[] args) 
	{
		int a[][] = new int[3][3];
		
		int v = 1;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
				a[i][j] = v++;
		}
		
		
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=0;j<a[i].length;j++)
//			{
//				System.out.print(a[i][j] + " ");
//			}
//			System.out.println();
//		}
		
//		print multi-dimentional array using enhanced for loop
		for(int b[]:a)
		{
			for(int e:b)
				System.out.print(e + " ");
			System.out.println();
		}
		
		
	}

}
