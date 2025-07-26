package controlstatements;

/*


Row1	1 2 3
Row2	1 2 3
Row3	1 2 3

* * *
* * *
* * *

*
* *
* * *
 
*/
public class NestedForLoop {

	public static void main(String[] args) {

		
//		for(int i=1;i<=3;i++)			// Row
//		{
//			for(int j=1;j<=3;j++)		// Column
//				System.out.print(j + " ");
//			System.out.println();
//		}
		
//		for(int i=1;i<=3;i++)			// Row
//		{
//			for(int j=1;j<=3;j++)		// Column
//				System.out.print("* ");
//			System.out.println();
//		}
		
		for(int i=1;i<=3;i++)			// Row
		{
			for(int j=1;j<=i;j++)		// Column
				System.out.print("* ");
			System.out.println();
		}
		
	}

}
