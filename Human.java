class Human
{
	String name;
	float dateOfBirth;
	
	public void doActivity()
	{
		System.out.println("Do Activity");
	}
}

class Student extends Human
{
	public void doActivity()
	{
		System.out.println("studying");
	}
}
class Employee extends Human
{
	public void doActivity()
	{
		System.out.println("Work");
	}
}
class Inheritance
{
public static void main(String []a)
{
	Student s =new Student();
	s.doActivity();
	Employee e =new Employee();
	e.doActivity();
}
}
