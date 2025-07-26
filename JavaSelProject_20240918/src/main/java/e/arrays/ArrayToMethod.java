package e.arrays;

public class ArrayToMethod {

	public static void display(int a)
	{
		System.out.println(a);
	}
	
	
	public static void maxArr(int a[])
	{
		int max=a[0];
		for(int e:a)
			if(max<e)
				max=e;
		System.out.println("max number in arr: " + max);
	}
	
	public static int[] getArr()
	{
		return new int[] {10, 45, 23, 40, 20};
	}
	
	
	public static void main(String[] args) {

		int b = 10;
		display(b);
		display(20);
		
		int a[] = {5, 10, 30, 20, 15, 10};
		maxArr(a);
		
		maxArr(getArr());
	}

}
