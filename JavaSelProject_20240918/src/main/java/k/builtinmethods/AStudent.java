package k.builtinmethods;


public class AStudent {

//	instance properties/ instance variable
	int rollNo;
	String name;
	String city;
	
//	empty constructor, name is same as class, get called automatically during object creation
	public AStudent(int rollNo, String name, String city)
	{
		this.rollNo = rollNo;
		this.name = name;
		this.city = city;
	}
	
	public String toString()
	{
		return rollNo + " " + name + " " + city;
//		return "Hello";
	}
	
	public boolean equals(Object obj)
	{
		
		AStudent s = (AStudent)obj;
		return (this.rollNo == s.rollNo && this.name.equals(s.name) && this.city.equals(s.city));
	}
	
//	public void display()
//	{
//		System.out.println(this.rollNo + " " + this.name);
//	}
	
	public static void main(String[] args) {
		AStudent s1 = new AStudent(10, "Sachin", "Mumbai");
		AStudent s2 = new AStudent(7, "MS Dhoni", "Ranchi");
		AStudent s3 = new AStudent(10, "Sachin", "Mumbai");
		AStudent s4 = s1;
		
//		int i=10;
//		System.out.println(i); // ex
		
		System.out.println(s1);
		
//		String str1 = "Sachin";
//		String str2 = new String("Sachin");
//		System.out.println(str1.equals(str2)); // ex
		
		System.out.println(s1.equals(s1)); // true  
		System.out.println(s1.equals(s4)); // true
		System.out.println(s1.equals(s2)); // false
		System.out.println(s1.equals(s3)); // false or true
		
//		s1.display();
//		s2.display();
		
	}

}
