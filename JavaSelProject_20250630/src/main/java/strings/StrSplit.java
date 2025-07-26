package strings;

import java.util.Arrays;

public class StrSplit {

	public static void main(String[] args) {

		String str = "Sachin,Tendulkar,10,ODI,100,50";
		
		String values[] = str.split(",");
		
		for(String v:values)
			System.out.println(v);
		
//		-------------------------
		System.out.println(Arrays.toString(values));
		
//		challenge: print following string by removing the spaces 
		String name = "Sachin Tendulkar Mumbai";
		
//		System.out.println(name.replace(" ", ""));
//		System.out.println(Arrays.toString(name.split(" "))); // not suitable for current problem statement
		
//		System.out.println(name.replaceAll("\\s", ""));
//		System.out.println(name.strip().replace(" ", "")); // strip() not required
		
		System.out.println(String.join("", name.split(" ")));
		
		
	}

}
