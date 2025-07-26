package arrays;

//		pass an array to a method maxArr() which will find & return maximum number from array
public class ArrayToMethod {

	private static int maxArr(int a[]) 
	{
		int max = a[0];
		
		for(int e:a)
		{
			if(e>max)
				max = e;
		}
		return max;
	}


	public static void main(String[] args) {
		
		int a[] = {5, 10, 30, 20, 15, 10};

		System.out.println(maxArr(a));
		
		
	}

}
