package b.contorlstatements;

public class ForEachLoop {

	public static void main(String[] args) {

		int marks[] = {45, 45, 23, 12, 90, 50};
		
//		print the array elements (>=30) using enhanced for loop, use continue
		
		for(int m : marks)
		{
			if (m<30)
				continue;
			System.out.println(m);
		}
		
//		-----------------------------
		String str[] = {"Rohit Sharma", "Virat Kohli", "MS Dhoni"};
		
		for(String s:str)
			System.out.println(s);
		
	}

}
