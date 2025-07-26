package e.arrays;

public class EArrayToMethod {

	public static void maxArr(int a[])
	{
		int max=a[0];
		for(int e:a)
			if(max < e)
				max=e;
		System.out.println("max number in arr: " + max);
	}
	
	public static int[] getArr()
	{
		return new int[] {10,45,23,90,20};
	}
	
	
	public static void main(String[] args) {

		
		int a[] = {5, 10, 20, 50, 15, 10};

		
		for(int e:a)
		{
			System.out.print(e + " ");
		}
		System.out.println();
		maxArr(a);
		
////		anonymous array to function
//		maxArr(new int[]{4,2,6,1,9,2});
//		
//		
		int b[] = getArr();
		for(int e:b)
		{
			System.out.print(e + " ");
		}
		System.out.println();
		
		
	}

}
