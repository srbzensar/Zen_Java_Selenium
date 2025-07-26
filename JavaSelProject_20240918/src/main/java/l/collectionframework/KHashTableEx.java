package l.collectionframework;

import java.util.Hashtable;

public class KHashTableEx {
	public static void main(String[] args) {
		Hashtable<Integer, String> hst=new Hashtable<Integer, String>();
		
//		hst.put(1, null); // value cannot be null
//		hst.put(null, null); // both key and value cannot be null
//		hst.put(null, "Microsoft"); // key cannot be null
		
		hst.put(11, "API");
		hst.put(22, "Java");
		hst.put(3, "Selenium");
		hst.put(14, "Java");
		hst.put(5, "Python");
		hst.put(6, "Testing");
		System.out.println(hst);
	}
}