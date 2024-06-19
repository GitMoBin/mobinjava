class FinallyExample2
{
	public static void main(String[] args) 
	{
		System.out.println("Execution Start's");
		m1();
		System.out.println("Execution End's");	
	}
	static void m1()
	{
		System.out.println("m1()");
		try{
			System.out.println("try");
			System.out.println(10/0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("ArithmeticException Handled");
		}
		finally{
			System.out.println("Hello finally");
		}
		System.out.println("m1()()");
	}
}