class StringLengthMethod
{
	static String a = "Hello";
	public static void main(String[] args) 
	{
		int length = userLength();
		System.out.println(a+ " - " +length);
	}
	public static int userLength()
	{
		int l=0;
		for(int i=0; ; i++)
		{
			try{
				a.charAt(i);
				l++;
			}catch(StringIndexOutOfBoundsException s){
				break;
			}
		}
		return l;
	}
}