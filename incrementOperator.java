class incrementOperator
{
	public static void main(String[] args) 
	{
		int a = 2;//2
		int b =a++;//2(3)
		int c = ++a;//4(5)
						// 4 + 3   + 5 = 12
		System.out.println(a + ++b + ++c);
		
	}
}