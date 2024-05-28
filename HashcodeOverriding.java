class Employee
{
	String name;
	static int id = 0;
	Employee(String name)
	{
		this.name = name;
		id++;
	}
	public int hashcode()
	{
		return id;
	}
	public String toString()
	{
		return this.id+"."+this.name;
	}
}
class HashcodeOverriding
{
	public static void main(String[] args) 
	{
		Employee obj1 = new Employee("Ramesh");
		System.out.println(obj1);
		System.out.println(obj1.id);
		Employee obj2 = new Employee("Suresh");
		System.out.println(obj2);
		System.out.println(obj2.id);
	}
} 