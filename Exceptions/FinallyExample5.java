class FinallyExample5
{
	public static void main(String[] args) 
	{
		try{
			System.out.println("Outer try");
			System.out.println(10/0);
		}	
		catch(ArithmeticException ae)
		{
			System.out.println("Outer catch 1");
			try{
				System.out.println("Inner try");
				System.out.println(10/0);
			}
			catch(NullPointerException np)
			{
				System.out.println("Inner catch");
			}
			finally{
				System.out.println("Inner finally");
			}
		}
		catch(Exception e)
		{
			System.out.println("Outer catch");
		}
		finally{
			System.out.println("Outer finally");
		}
	}
}