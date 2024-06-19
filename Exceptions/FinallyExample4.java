class FinallyExample4
{
	public static void main(String[] args) 
	{
		System.out.println("Exe starts");
		m1();
		System.out.println("Exe ends");	
	}
	static void m1()
	{
		System.out.println("m1() starts");
		try{
			System.out.println("try");
			return;
		}
		catch(ArithmeticException ae)
		{
			System.out.println("ArithmeticException Handled");
		}
		finally{
			System.out.println("Hello finally");
		}
		System.out.println("m1() ends");
	}
}