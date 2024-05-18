class Student
{
	String name;
	String branch;
	static Student singletonObject;

	private Student(String name, String branch)
	{
		this.name = name;
		this.branch = branch;
	}

	public static Student getInstance(String name, String branch)
	{
		if(singletonObject==null)
		{
			singletonObject = new Student (name,branch);
			return singletonObject;
		}else
		{
			return singletonObject;
		}

	}
	public static void main(String[] args) {
		System.out.println("Hello from student main.");
		Student obj = new getInstance("Ramesh","Mechanical");
		System.out.println(obj);
		Student obj1 = new getInstance("Suresh","Electrical");
		System.out.println(obj1);
	}
	
}