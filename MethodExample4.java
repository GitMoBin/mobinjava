class MethodExample4
{
	public static void main(String[] args) // calling method
	{
		System.out.println("main starts");
		pathan();
		System.out.println("main ends");
		
	}
	public static void pathan()//called method & calling method
	{
		System.out.println("pathan start");
		khan();
		System.out.println("pathan ends");
	}
	public static void khan()//called method & calling method
	{
		System.out.println("khan starts");
		shaikh();
		System.out.println("khan ends");
	}
	public static void shaikh()//called method & calling method
	{
		System.out.println("shaikh starts");
		System.out.println("shaikh ends");
	}

}