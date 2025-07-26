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
//		
//		System.out.println(a%b); // 0 remainder using mod
//		System.out.println(a%4); // 2
//		
////		unary
////		a = a + 1;
//		a++; // postfix
//		System.out.println(a); // 11
//		System.out.println(a++); // 11
//		System.out.println(a); // 12
//		
//		System.out.println(++a); // 13 (prefix)
//		
//		int r = a--; 
//		System.out.println(r); // 13
//		System.out.println(a); // 12
//		
//		r = --a; 
//		System.out.println(r); // 11
//		System.out.println(a); // 11
	
		
//		Relational operators
		System.out.println(4<5); // true
		System.out.println(b<5); // false
		System.out.println(b<=5); // true
		
//		>, >=
		
//		System.out.println(a=b); // = is an ssignment operator
		
		// comparison			==      !=
		System.out.println(a==b); //  f
		System.out.println(b==5); //  t
		
		System.out.println(a!=b); // t
		
//		--------------------------------
		
//		assignment operators
		a = b; 
		System.out.println(a);
		
//		a = a + 5;
		a += 5;
		System.out.println(a); // 10
		
//		-=   *=   /=   %=
		
	}

}
