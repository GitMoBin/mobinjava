class ExceptionExample5
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("Hi from try");
			Thread.sleep(1000);
		}	
		catch(InterruptedException ie)
		{
			System.out.println("InterruptedException Handled");
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled");
		}
		catch(RuntimeException re)
		{
			System.out.println("RuntimeException Handled");
		}
	}
}