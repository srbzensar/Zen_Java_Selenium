package e.arrays;
//write a method to find max value of an array
public class EMaxArrMethod {
	
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
	
//	Challenge: Max Matrix method
	
}

