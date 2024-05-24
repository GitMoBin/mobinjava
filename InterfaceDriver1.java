interface Parent1
{
	void m1();
}
interface Parent2
{
	void m2();
}
interface Child extends Parent1, Parent2
{
	void m3();
}
class SubChild implements Child
{
	public void m1()
	{
		System.out.println("Hi from Parent1 m1()");
	}
	public void m2()
	{
		System.out.println("Hi from Parent2 m2()");
	}
	public void m3()
	{
		System.out.println("Hi from Child m3()");
	}
}
class InterfaceDriver1
{
	public static void main(String[] args) 
	{
		SubChild obj = new SubChild();
		obj.m1();
		obj.m2();/
		obj.m3();	
	}
}