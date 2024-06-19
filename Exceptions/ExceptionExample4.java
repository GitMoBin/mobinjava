class ExceptionExample4
{
	public static void main(String[] args) 
	{
		System.out.println("Starts");
		try
		{
			Thread.sleep(2000);
		}	
		catch(RuntimeException re)
		{
			System.out.println("RuntimeException Handled");
		}
		catch(InterruptedException ie)
		{
			System.out.println("InterruptedException Handled");
		}
		System.out.println("Ends");
	}
}