package e.arrays;

public class BSimpleArrayMulti {

	public static void main(String[] args) {

		
//		int a[] = {10, 20, 30, 40, 50};
		
		int m[][] = {
					{11,21,31},
					{20,25,30},
					{35,40,10},
					{60,70,80}
					};  
		
		
//  what is the size of m	 4   3   12
// how do we access first array from m	> m[0]		


// 		first [] represents row, second [] represents column		
//		m[][]
		System.out.println(m[0][0]); // 11
		System.out.println(m[1][1]); // 25
		System.out.println(m[2][0]); // 35
		
//		m[0]		first array
//		m[1]		second array
//		m[2]		third array
		
		
//		traverse
//		for(int i=0;i<3;i++) // row
//		{
//			for(int j=0;j<3;j++) // col
//			{
//				System.out.print(m[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		for(int i=0;i<m.length;i++) // row
		{
			for(int j=0;j<m[i].length;j++) // col
			{
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		

		
	}

}
