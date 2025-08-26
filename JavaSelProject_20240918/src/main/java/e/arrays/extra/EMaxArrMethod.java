package e.arrays.extra;

public class EMaxArrMethod {

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


//public class MaxArrMethod {
//
//	
//	public static int add(int a, int b)
//	{
//		return a + b;
//	}
//	
//	
//	public static int maxArray(int a[]) // int a[] = {10, 30, 15, 20}
//	{
//		int max = a[0];
//		for(int e:a)
//			if(max<e)
//				max=e;
//		return max;
//	}
//	
//	public static int[] getArray()
//	{
////		return new int[]{500, 100, 200, 840, 200, 100};
////		or
//		int d[] = {500, 100, 200, 840, 200, 100};
//		return d;
//	}
	
	
	
//	public static void main(String[] args) 
//	{
////		challenge:
////		write a method to find max value of an array
//		
////		System.out.println(add(2, 3));
//		
//		int b[] = {5, 10, 20, 14, 20, 10};
//		
////		System.out.println(b);
//		
//		System.out.println(maxArray(b));
//		
////		System.out.println(maxArray(new int[]{5, 10, 20, 84, 20, 10}));
//		
//		int c[] = getArray();
//		for(int e:c)
//			System.out.print(e + " ");
//		System.out.println();
//	}
//
//}
