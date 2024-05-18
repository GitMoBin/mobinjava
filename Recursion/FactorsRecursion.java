class FactorsRecursion
{
	static int num = 10;
	static int i = 1;
	public static void main(String[] args) {
		Factors();
	}
	public static void Factors()
	{
		if(num%i==0)
		{
			System.out.println(i);
		}
		i++;
		if(i>5)
			return;
		Factors();
	}
}