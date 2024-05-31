class Employee
{
	String name;
	String empId;
	Employee(String name, String empId)
	{
		this.name = name;
		this.empId = empId;
	}
	protected void finalize()
	{
		
		System.out.println("OBJECT GET DESTROYED");
	}
}
class EmployeeDriver
{
	public static void main(String[] args) 
	{
		Employee obj = new Employee("Mobin","Mobin@123");
		System.out.println(obj.name);
		obj =null;
		System.gc();
		System.out.println(obj.name);
		
	}
}