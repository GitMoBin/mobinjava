interface Arithematic
{
	int add (int a,int b);
	int multi (int a, int b);
}
class Arith implements Arithematic
{
	public int add(int a, int b)
	{
		System.out.println(a+b);
		return a+b;
	}
	public int multi(int a, int b)
	{
		System.out.println(a*b);
		return a*b;
	}
} 
class interfaceDriver
{
	public static void main(String[] args) 
	{
		Arith obj = new Arith();
		obj.add(2,2);
		obj.multi(4,2);
	}
}