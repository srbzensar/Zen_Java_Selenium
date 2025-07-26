package c.oop.inheritance;

public class Person {

	String name;
	String city;
	
	Person()
	{
		name = "Sachin";
		city = "Mumbai";
	}
	
	Person(String name, String city)
	{
		this.name = name;
		this.city = city;
	}
	
	
	public void intro()
	{
		System.out.println("Hello, I'm " + name + " from " + city);
	}
	
	

}
