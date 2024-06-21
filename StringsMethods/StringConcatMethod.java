class StringConcatMethod
{
	public static void main(String[] args) 
	{
		String s1="H";
		String s2="E";	
		String s3="L";	
		String s4="L";	
		String s5="O";	

		String merged = s1.concat(s2.concat(s3.concat(s4.concat(s5))));
		System.out.println(merged);

	}
}