package b.controlstatements;

public class ForEachLoop {

	public static void main(String[] args) {
		String str[] = {"Rohit Sharma", "Virat Kohli", "MS Dhoni"};
		
//		for(int i=0;i<str.length;i++)
//			System.out.println(str[i]);

//		enhanced for loop (foreach loop)
//		for(String s:str)
//		{
//			System.out.println(s);
//		}
		
//		-------------------
		int marks[] = {45, 45, 23, 12, 90, 50};
//		for(int i=0;i<marks.length;i++)
//			System.out.println(marks[i]);
		
		for(int m:marks)
		{
			System.out.println(m);
		}
		
//	-----------------------
		
		
		
		
		
	}

}
