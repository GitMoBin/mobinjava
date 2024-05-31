class ExceptionExample
{
	public static void main(String[] args) 
	{
		System.out.println("HI");
		try{
			System.out.println("Outer try");
			System.out.println(10/0);
		}	
		catch(ArithmeticException i)
		{
			System.out.println("Outer catch 1");
			try
			{
				System.out.println("Inner try");
				System.out.println(10/0);
			}
			catch(NullPointerException ie)
			{
				System.out.println("Inner catch");
			}
		}
		catch(RuntimeException i)
		{
			System.out.println("Outer cathch 2");
		}
	}
}