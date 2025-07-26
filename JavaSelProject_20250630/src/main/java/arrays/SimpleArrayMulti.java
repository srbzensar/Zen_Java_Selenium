package arrays;

public class SimpleArrayMulti {

	public static void main(String[] args) {

//		int a[] = {10, 20, 80, 5, 15}; 
		
		int m[][] = {
					{10, 20, 30},
					{70, 80, 90},
					{40, 50, 60}
					};
		
//		size: RowsxColumns 3x3

//		first array: m[0]				
//		first element of first array: m[0][0]
//									[] row [] column
		
		for(int i=0;i<m.length;i++)  // row
		{
			for(int j=0;j<m[i].length;j++) // column
			{
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}

}
