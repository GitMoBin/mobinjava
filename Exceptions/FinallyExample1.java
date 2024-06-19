class FinallyExample1
{
	public static void main(String[] args) 
	{
		System.out.println("Execution Start's");
		int i=1;
		while(i<=10);
		{
			System.out.println(i);
			i++;
		}	
		try{
			System.out.println("Try ");
			System.out.println(10/0);
		}
		finally{
			System.out.println("Hello from finally");
		}
	}
}