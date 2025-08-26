package e.arrays.extra;

public class ASimpleArray {

	public static void main(String[] args) {

		
		int a[] = {5, 10, 20, 50, 15, 10};

		System.out.println(a[3]);
//		System.out.println(a[6]); // ArrayIndexOutOfBoundsException:
		
		
////		traverse
//		for(int i=0;i<6;i++) // length is the property of array
//		{
//			System.out.print(a[i] + " ");
//		}
		
//		for(int i=0;i<a.length;i++) // length is the property of array
//		{
//			System.out.print(a[i] + " ");
//		}
		
//		System.out.println();
//		for each loop / enhanced for loop
		for(int e:a)
		{
			System.out.print(e + " ");
		}
		
	}

}
