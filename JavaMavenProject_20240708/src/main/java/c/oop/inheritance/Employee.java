package c.oop.inheritance;

public class Employee extends Person{

	int empId;
	int salary;
	
	public Employee()
	{
		
	}
	
	public Employee(int empId, String name, String city, int salary) {
		super(name, city);
		this.empId = empId;
		this.salary = salary;
	}

	public void show()
	{
		System.out.println("show of employee");
	}
	public static void main(String[] args) {
		
		Employee e1 = new Employee(1, "Rahul", "Bengaluru", 50000);
		System.out.println(e1.empId);
		System.out.println(e1.name);
		System.out.println(e1.city);
		System.out.println(e1.salary);

		e1.intro();
		e1.show();
	}
}
