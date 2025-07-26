package arrays;

public class SimpleArray {

	public static void main(String[] args) {

		int a[] = {10, 20, 80, 5, 15}; 

//		System.out.println(a[0]);
//		System.out.println(a[4]);
//		System.out.println(a[5]); // ArrayIndexOutOfBoundsException
		
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
