package e.arrays;

public class SimpleArraysMulti {
	public static void main(String[] args) {
//		int a[] = {10, 20, 30, 40, 50};
		
//		int m = 10;
//		int m[] = {10, 40, 50};
		int m[][] = {
				{10, 20, 30},
				{40, 50, 60},
				{70, 80, 90}
		};
		
		
//		m[0]
//		m[1][1]
		
		
		System.out.println(m[0][0]);  // 10
		System.out.println(m[1][1]);  // 50
		System.out.println(m[2][2]);  // 90
		
//		print matrix m 
		/*
		 10 20 30
		 40 50 60 
		 70 80 90 
		*/
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
}
