package d.oop.polymorphism;

public class Person {

	String name;
	String city;
	
	public Person()
	{
		this.name = "Sachin";
		this.city = "Mumbai";
	}
	
	public Person(String name, String city) 
	{
		this.name = name;
		this.city = city;
	}

	public void intro()
	{
		System.out.println("Hello, I am " + this.name + " from " + this.city);
	}


}
