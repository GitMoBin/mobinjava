class FinallyExample3
{
	public static void main(String[] args) 
	{
		System.out.println("execution starts");
		m1();
		System.out.println("execution ends");	
	}
	static void m1()
	{
		System.out.println("m1() starts");
		try{
			System.out.println("try");
			System.out.println(10/0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("ArithmeticException Handled");
			return;
		}
		finally
		{
			System.out.println("finally");
		}
		System.out.println("m1() ends");
	}
}