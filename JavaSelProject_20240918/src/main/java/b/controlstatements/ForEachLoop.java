package b.controlstatements;

public class ForEachLoop {

	public static void main(String[] args) {

		String str[] = {"Rohit Sharma", "Virat Kohli", "MS Dhoni"};
		
		for(String s: str)
		{
			System.out.println(s);
		}
		
		int marks[] = {45, 45, 23, 12, 90, 50};
		for(int m:marks)
		{
			System.out.println(m);
		}
		
		for(int m:marks)
		{
			if(m<30)
				continue;
			System.out.println(m);
		}
	}

}
