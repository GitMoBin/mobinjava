class Demo1
{
	String str1 = "Hi i am from demo7 class";
	public static void main(String[] args) 
	{
		System.out.println("Hi from main");
		Demo2 obj = new Demo2();
		obj.m1();
	}
}
class Demo2
{
	static Demo1 obj = new Demo1();
	void m1()
	{
		System.out.println("Hi from m1()");
		System.out.println(obj.str1);
		m2();
	}
	void m2()
	{
		System.out.println("Hi from m2()");
		System.out.println(obj.str1);
		m3();
	}
	static void m3()
	{
		System.out.println("Hi from m3()");
		System.out.println(obj.str1);		
	}
}