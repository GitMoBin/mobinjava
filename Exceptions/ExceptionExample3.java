class ExceptionExample3
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("Outer try");
			String str = null;
			System.out.println(str.isEmpty());
		}
		catch(ArithmeticException ae)
		{
			System.out.println("ArithmeticException handled");
		}	
		catch(RuntimeException re)
		{
			System.out.println("RuntimeException handled");
		}
		catch(NullPointerException np)
		{
			System.out.println("NullPointerException handled");
		}

	}
}