class SpyNumber
{
	public static void main(String[] args) 
	{
		int num = 1124;
		int sum=0;
		int product =0;
		int dup=num;

		while(num!=0)
		{
			int rem = num%10;
			sum+=rem;
			num/=10;
			product+=rem;
		}
		System.out.println((sum==product)?(dup+" is a spy number"):(dup+ " Not a spy num"));
		
	}
}