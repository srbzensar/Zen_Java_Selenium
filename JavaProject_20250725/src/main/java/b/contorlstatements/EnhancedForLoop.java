package b.contorlstatements;

public class EnhancedForLoop {

	public static void main(String[] args) {
		int marks[] = {5, 10, 20, 50, 15, 10};
		
		
		for(int i=0; i<marks.length; i++)
		{
//			System.out.println(a[i]);
			System.out.print(marks[i] + " ");
		}
		System.out.println();
		
		
//		enhanced for loop/ for each loop
		for(int n: marks)
		{
			System.out.print(n + " ");
		}
		
		
//		------------------------------
		String players[] = {"Sachin", "Saurav", "Virat", "Dhoni", "Rahul"};
		
		
		
		
	}

}
