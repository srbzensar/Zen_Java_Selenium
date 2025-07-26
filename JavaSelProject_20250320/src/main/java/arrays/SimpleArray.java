package arrays;

public class SimpleArray {

	public static void main(String[] args) {
		
//		int a = 10;
		
		int a[] = {5, 10, 20, 40, 10, 12};
//		int[] b = {5, 10, 20, 40, 10, 12};
//		int []c = {5, 10, 20, 40, 10, 12};
		
		
//		System.out.println(a[3]);
//		System.out.println(a[5]);
//		System.out.println(a[6]); // error: Index 6 out of bounds for length 6
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+ " ");
		}
		System.out.println();
		for(int i: a)
		{
			System.out.print(i+ " ");
		}
	}

}
