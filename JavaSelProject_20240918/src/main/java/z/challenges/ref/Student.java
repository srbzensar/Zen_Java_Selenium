package z.challenges.ref;

public class Student 
{
    private int rollNo;
    private String name;
    private String city;
    private int age;

    public Student(int rollNo, String name, String city, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.city = city;
        this.age = age;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
//        return rollNo + " - " + name + " from " + city + " (" + age + ")";
        return String.format("%d - %s from %s (%d)", rollNo, name, city, age);
    }
}
