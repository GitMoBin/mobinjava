// class EqualExample
// {
// 	String gfName;
// 	EqualExample(String gfName)
// 	{
// 		this.gfName=gfName;
// 	}
// 	@Override
// 	public boolean equals(Object obj)
// 	{
// 		EqualExample k = (EqualExample)obj;
// 		return this.gfName==k.gfName;
// 	}
// 	public static void main(String[] args) {
// 		EqualExample k1 = new EqualExample("Karan");
// 		EqualExample k2 = new EqualExample("Karan");
// 		System.out.println(k1.equals(k2));
// 	}
// }
class EqualExample
{
	public static void main(String[] args) 
	{
		String s1 = new String("Karan");
		String s2 = new String("Karan");	
		System.out.println(s1.equals(s2));
// Output is true because the equals method is already overriden in string class implecitily.
	}
}