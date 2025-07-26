package arrays;

public class SimpleArrayMD {

	public static void main(String[] args) {

		int a[][] = new int[3][3]; // declaration, instantiation
		
//		initialize using for loop
		int v = 1;
		for(int i=0; i<a.length; i++)
		{
			for(int j=0;j<a[i].length; j++)
				a[i][j] = v++;
		}
		
//		print using normal for loop
		for(int i=0; i<a.length; i++)
		{
			for(int j=0;j<a[i].length; j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
//		print using enhanced for loop
		for(int b[]:a)
		{
			for(int e:b)
				System.out.print(e + " ");
			System.out.println();
		}
		
		
	}

}
