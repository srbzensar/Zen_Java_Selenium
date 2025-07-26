package arrays;

public class SimpleArraysMulti {

	public static void main(String[] args) {

		int a[] = {10, 20, 40, 50, 30};
		
		int m[][] = {
				{10, 20, 30}, 
				{40, 50, 60}, 
				{70, 80, 90}
				};
				
		System.out.println(m);
		System.out.println(m[0]); // first array or row
		System.out.println(m[0][1]);
		
		System.out.println(m[0][0]);  // 10
		System.out.println(m[1][1]);  // 50
		System.out.println(m[2][2]);  // 90
		
//		System.out.println(m[1]);
//		System.out.println(m[1,2]);
//		System.out.println(m[1][2]);
//		System.out.println(m[0][1]);
		
		for(int i=0; i<m.length; i++)
		{
			for(int j=0;j<m[i].length; j++)
			{
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
