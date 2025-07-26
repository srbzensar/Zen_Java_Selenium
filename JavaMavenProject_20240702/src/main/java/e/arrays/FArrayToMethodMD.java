package e.arrays;

public class FArrayToMethodMD {

	public static void maxArr(int m[][])
	{
		int max=m[0][0];
		for(int a[]:m)
			for(int e:a)
				if(max < e)
					max=e;
		System.out.println("max number in arr: " + max);
	}
	
	
	public static void main(String[] args) {

		
		int m[][] = {
				{11,21,31},
				{20,25,30},
				{35,90,10},
				{60,70,80}
				};  

		
		for(int i=0;i<m.length;i++) // row
		{
			for(int j=0;j<m[i].length;j++) // col
			{
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		
		maxArr(m);
		
	}

}
