class StringExample4
{
	public static void main(String[] args) 
	{
		String s1 = "Java";	
		String s2 = "Java";	
		String s3 = new String("java");
		String s4 = new String("java");
		System.out.println(s1==s2);//compare reference or address of object
		System.out.println(s1.equals(s2));//compare data or content
		System.out.println(s3==s4);//compare reference or address of object
		System.out.println(s3.equals(s4));//compare data or content

	}
}