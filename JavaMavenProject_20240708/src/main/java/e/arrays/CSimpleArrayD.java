package e.arrays;

public class CSimpleArrayD {

	public static void main(String[] args) {

//		int a[] = {5, 10, 20, 50, 15, 10};  // declaration, instantiation, initialization
		
		int a[] = new int[5]; // declaration, instantiation
		
////		int []c; 
////		int[] d;
//		int b[]; // declaration
//		b = new int[2]; // instantiation
//		// initialization
//		b[0] = 5;
//		b[1] = 50;
				
		
//		initialization
		a[0] = 10;
		a[1] = 30;
		a[2] = 20;
		a[3] = 50;
		a[4] = 60;
//		a[5] = 80; //error

		
//		for(int i=0;i<a.length;i++) // length is the property of array
//		{
//			System.out.print(a[i] + " ");
//		}
//		
//		System.out.println();
////		for each loop
		for(int e:a)
		{
			System.out.print(e + " ");
		}
		
	}

}
