class StringBufferConstructor
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.length());
		System.out.println(sb.capacity());	

		StringBuffer sb1 = new StringBuffer("Mobin");
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());	
	}
}