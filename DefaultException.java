class DefaultException
{
	public static void main(String[] args) 
	{
		try
		{
			m1();
		}catch(ArithmeticException ae)
		{
			ae.printStackTrace();
			System.out.println("Hellooo");
		}	
	}
	public static void m1()
	{
		System.out.println("m1()");
		m2();
	}
	public static void m2()
	{
		System.out.println("m2()");
		m3();
	}
	public static void m3()
	{
		System.out.println("m3()");
		System.out.println(10/0);
	}
}