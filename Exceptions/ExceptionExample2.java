class ExceptionExample2
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("Hi from try");
			try
			{
				System.out.println("Inner try");
				System.out.println(10/0);
			}
			catch(NullPointerException a)
			{
				System.out.println("Inner catch");
			}
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Ouuter catch");
		}	
	}
}