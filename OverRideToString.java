import java.util.*;
class Student
{
	String name;
	String place;
	String branch;
	Student(String name, String place, String branch)
	{
		this.name =name;
		this.place =place;
		this.branch = branch;
	}
	// toString () prints the reference of object.
	@Override
	public String toString()
	{
		return "Hi my name is "+this.name+", I am from "+this.place+", I had completed "+this.branch;
	}
}
class OverRideToString
{
	public static void main(String[] args) 
	{
		Student obj = new Student("Ramesh","Pune","Mechanical");
		System.out.println(obj);
		Student obj1 = new Student("Suresh","Hydrabad","Electrical");
		System.out.println(obj1);
		Student obj2 = new Student("Ganesh","Pune","Civil");
		System.out.println(obj2);
	}
}