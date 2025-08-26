package c.arrayex;

public class SimpeArrayMulti {

	public static void main(String[] args) {

		int a[] = {5, 10, 20, 50, 15, 10};
		
		int m[][] = {
					{10, 20, 30},
					{40, 60, 50},
					{90, 80, 70}
					};
		
//		size of multi dim array
//		3x3
//		4x3
//		rowxcol
		
		// how do we access first array from m	>	m[0]
		
//		System.out.println(a);
//		System.out.println(m[0]);
		
		
		System.out.println(m[0][0]);
		System.out.println(m[1][1]);
		System.out.println(m[2][0]);
//		System.out.println(m[row][col]);
		
//		for(int i=0;i<=2;i++)
//		{
//			for(int j=0;j<=2;j++)
//			{
//				System.out.print(m[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m[i].length;j++)
			{
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}
