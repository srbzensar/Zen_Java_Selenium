package d.packagesex.packa;

public class Z extends X{
// Child class within same package
	
	public static void main(String[] args) {
		Z obj = new Z();
		
		System.out.println(obj.pu);
//		System.out.println(obj.pr); // error
		System.out.println(obj.ch); 
		System.out.println(obj.d); 
	}

}
