abstract class Parent
{
	abstract void m1(String);
	abstract void m2(String);
	String m3()
	{
		System.out.println("Hi i am m3 from parent.");
	}
}
abstract class child1
{
	String m2()
	{
		System.out.println("m2 implemented by child1.");
		return(String);
	}
	String m4();
}
class subchild
{
	String m1()
	{
		System.out.println("m1 implemented by subchild.");
		return(String);	
	}
	String m4()
	{
		System.out.println("m4 implemented by subchild.");
		return(String);	
	}
}
class child2
{
	String m1()
	{ 
		System.out.println("m1 implemented by child2.");
		return(String);	
	}
	String m2()
	{
		System.out.println("m2 implemented by child2.");
		return(String);
	}
	String m5()
	{
		System.out.println("m5 implemented by child2.");
		return(String);
	}
}
class PAndCDriver
{
	public static void main(String[] args) 
	{
	child2 obj = new child2();
	obj.m1();
	obj.m2();
	obj.m5();
	subchild obj1 = new subchild();	
	}
}