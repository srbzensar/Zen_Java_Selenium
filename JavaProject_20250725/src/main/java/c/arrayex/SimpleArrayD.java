package c.arrayex;

public class SimpleArrayD {

	public static void main(String[] args) 
	{

//		int a[] = {5, 10, 20, 50, 15, 10};  // declaration, instantiation, initialization
		
		int a[] = new int[5];  // declaration, instantiation
		
//		int []c;
//		int[] d; 
		
//		int b[]; // declaration
//		b = new int[2]; // instantiation
//		
////		initialization
//		b[0] = 5;
//		b[1] = 50;
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
//		a[5] = 60; // exception
		
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		
		for(int e:a)
			System.out.println(e);
		
	}

}
