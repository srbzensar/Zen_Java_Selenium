package strings;

import java.util.Arrays;

public class StrSplit {

	public static void main(String[] args) {

//		String str = "Sachin,Tendulkar,10,ODI,100,50";
		String str = "Sachin\nTendulkar\n10\nODI\n100\n50";
		
		String values[] = str.split(",");
		
//		for(String v: values)
//			System.out.println(v);
		
		System.out.println(Arrays.toString(values));
		
		String name = "Sachin Tendulkar Mumbai";
		
		
	}

}
