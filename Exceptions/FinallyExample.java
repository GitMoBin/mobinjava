class FinallyExample
{
	public static void main(String[] args) 
	{
		for( ; ; )
		{
			System.out.println("Hello");
		}	
		System.out.println(10/0);
	}
}