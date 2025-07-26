package arrays;

public class SimpleArrayD {

	public static void main(String[] args) {

//		int a[] = {10, 20, 80, 5, 15}; // Declaring, instantiation, initialization

		int a[] = new int[5]; // Declaring, instantiation
		
		/*
		int []a;
		int[] a;
		int a[];
		*/
		
//		int b[]; // Declaring
//		b = new int[4]; // instantiation
//		
////		initialization
//		b[0] = 10;
//		b[1] = 20;
//		b[2] = 30;
//		b[3] = 40;
		
//		initialize
		for(int i=0; i<a.length; i++)
		{
			a[i] = 10 * (i+1);
		}
		
		
//		challenge: traverse thru this array using simple for loop and print values on the same line
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
//		challenge: traverse thru this array using enhanced for loop and print values on the same line
		for(int i:a)
			System.out.print(i + " ");
		
	}

}
