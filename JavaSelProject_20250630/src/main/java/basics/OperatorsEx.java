package basics;

public class OperatorsEx {

	public static void main(String[] args) {

		int a = 10;
		int b = 5;
		
////		Arithmetic
//		System.out.println(a+b); // 15
//		System.out.println(a-b); // 5
//		System.out.println(a*b); // 50
//		System.out.println(a/b); // 2
//		
//		System.out.println(a%b);
//		System.out.println(a%4);
//		System.out.println(11%4);
//		System.out.println(0%4);
		
//		unary
//		a = a + 1;
		a++;
		System.out.println(a); // 11
		System.out.println(a++); // 11
		// 12
		
		System.out.println(++a); // 13
		
//		similarly we can use a-- or --a
		
//		Relational operators
		System.out.println(4<5); // T
		System.out.println(b<5); // F
		System.out.println(b<=5); // T
//		> >=
		
//		System.out.println(a=b); // 5
//		= is an assignment operator
		
		System.out.println(a==b);
		System.out.println(b==5);	
		
		System.out.println(a!=b);
		
//		assignment operators
		a = b; 
		System.out.println(a);
		
		a = a + 5;
		System.out.println(a);
		
		a += 5;
		System.out.println(a);
		
//		-=   *=   /=   %=
		
		
		
	}

}
