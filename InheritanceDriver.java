class Parent
{
	String str1 = "Hi from parent class";
	void m1()
	{
		System.out.println("Hi from parent class m1().");
	}
	static void m2()
	{
		System.out.println("Hi from parent  class static m2().");
	}
}

class Child extends Parent
{
	String str2 = "Hi from child class";
	void m3()
	{
		System.out.println("Hi from child class m3().");
	}
	static void m4()
	{
		System.out.println("Hi from child class static m4().");
	}
}

class InheritanceDriver
{
	public static void main(String[] args) 
	{
		Child obj = new Child();
		obj.m3();
		System.out.println(obj.str2);
		obj.m1();
		System.out.println(obj.str1);
		obj.m4();
		obj.m3();	
	}
}