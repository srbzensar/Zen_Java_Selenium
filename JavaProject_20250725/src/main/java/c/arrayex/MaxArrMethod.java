package c.arrayex;
//write a method to find max value of an array
public class MaxArrMethod {
	
	public static int maxArray(int a[]) 
	{
		int max = a[0];
		for(int e:a)
			if(max<e)
				max=e;
		return max;
	}
	
	public static int[] getArray()
	{
		int d[] = {500, 100, 200, 840, 200, 100};
		return d;
	}
	
	public static void main(String[] args) 
	{
		int b[] = {5, 10, 20, 14, 20, 10};
		System.out.println(maxArray(b));
		
		int c[] = getArray();
		for(int e:c)
			System.out.print(e + " ");
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
