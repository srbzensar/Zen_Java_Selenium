package h.strings;

import java.util.Arrays;

public class EStrsplit {

	public static void main(String[] args) {

		String str = "Sachin,Tendulkar,10,ODI,100,50";
//		String str = "Sachin\nTendulkar\n10\nODI\n100\n50";
		
		
//		String values[] = str.split(",");
		String values[] = str.split("\\,");
//		String values[] = str.split("\n");
		
		
//		
//		for(String v:values)
//			System.out.println(v);
//		
//		System.out.println(Arrays.toString(values));
//		
		String name = "Sachin Tendulkar Mumbai";
//		System.out.println(Arrays.toString(name.split(" ")));
//		System.out.println(String.join("", name.split(" ")));
		
	}

}
