package a.basics;

public class Operators {
	public static void main(String[] args) {
			
			int a = 10;
			int b = 5;
			
	////		Arithmetic
	//		System.out.println(a+b); // 15
	//		System.out.println(a-b); // 5
	//		System.out.println(a*b); // 50
	//		System.out.println(a/b); // 2
	//		System.out.println(a%b); // 0  remainder using mod
	//		System.out.println(a%4); // 3  remainder using mod
	//		System.out.println(11%4); // 3  remainder using mod
	//		System.out.println(0%4); // 0  remainder using mod
			
	////		unary
//			a = a + 1; // binary operator
			a++;  // postfix
			System.out.println(a); // 11
			System.out.println(a++); // 11
			
			System.out.println(a); // 12
			
			int result = a++;
			System.out.println(result); // 12
			System.out.println(a); // 13
			
			System.out.println(++a); // 14 (prefix)
			
			int r = a--;
			System.out.println(r); // 14
			System.out.println(a); // 13
			
			r = --a;
			System.out.println(r);  
			System.out.println(a);
			
//			-----------------------------------
			
//			Relational operators
			
			System.out.println(4<5); // T
			System.out.println(b<5); // F
			System.out.println(b<=5); // T
			
//			>, >=
			
//			--------------------------
			
//			System.out.println(a=b); // = is an assignment operator

			System.out.println(a==b); // F 
			
//			-------------------------
			
//			assignment operators
			a = b;
			System.out.println(a);
			
//			a = a + 5;
			a += 5;
			System.out.println(a);
			
//			-=, *=, /=, %=
			
					
			
	}			
		
}
