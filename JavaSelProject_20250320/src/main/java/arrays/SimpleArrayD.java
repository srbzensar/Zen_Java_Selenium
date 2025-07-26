package arrays;

public class SimpleArrayD {

	public static void main(String[] args) {

//		int a[] = {5, 10, 20, 50, 15, 10}; // declaration, instantiation, initialization
		
		int a[] = new int[5]; // declaration, instantiation
		
//		a[0] = 5;
//		a[5] = 8;
		
//		initialization
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
//		a[5] = 80;
		
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
		
		for(int e: a)
		{
			System.out.print(e + " ");
		}
		
		
	}

}
