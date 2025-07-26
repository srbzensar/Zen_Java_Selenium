package arrays;

public class MaxArrFunc {

	public static void maxArr(int a[])
	{
		int max = a[0];
		for(int e:a)
			if(max < e)
				max = e;
		System.out.println("Max number in arr: " + max);
	}
	
	public static int[] getArr()
	{
		return new int[]{5, 10, 20, 50, 15, 10};
	}
	
	public static void main(String[] args) {

//		int a[] = {5, 10, 20, 50, 15, 10};
//
//		for(int e:a)
//		{
//			System.out.print(e + " ");
//		}
//		System.out.println();
//		
//		maxArr(a);
		
//		anonymous array 
		maxArr(new int[]{5, 10, 20, 50, 15, 10});
		
		int b[] = getArr();
		for(int e:b)
			System.out.print(e + " " );
		System.out.println();
	}

}
