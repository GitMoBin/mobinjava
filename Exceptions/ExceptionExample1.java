class ExceptionExample1
{
	public static void main(String[] args) 
	{
	try
	{
		System.out.println("Hi from try");
		System.out.println(10/0);
		try{
			System.out.println("Inner try");
			System.out.println(10/0);
		}
		catch(NullPointerException a)
		{
			System.out.println("Inner a handled");
		}
	}
	catch(ArithmeticException ae)
	{
		System.out.println("Hi from catch");
	}		
	}
}