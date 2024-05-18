import java.util.Scanner;
class MethodEmirpNumber
{
	public static void main(String[] args) 
	{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a number : ");
			int num = sc.nextInt();
			System.out.println(isPrime(num));
			if(isPrime(num))
			{
				int rev = revNum(num);
				// System.out.println(isPrime(rev)?"Emirp":"Not Emirp");
				for (int i =2;i<rev ;i++ ) 
				{
					if(rev%i==0)
					{
						System.out.println(rev+"Not emirp");
						break;
					}
					else
					{
						System.out.println(rev+"Emirp");
						break;
					}
					
				}
			}


	}
	public static boolean isPrime(int num)
	{
		if(num<=1)
		{
			return false;
		}
		boolean flag = true;
		for (int i=2;i<num ;i++ )
		{
			if(num%i==0)
			{
				flag = false;
				break;
			}		
			
		}
		// if(flag)
		// {
		// 	System.out.println(num+" -Prime");
		// }else
		// {
		// 	System.out.println(num+" - Not Prime");
		// }
		return flag;	
	}
	public static int revNum(int num)
	{
		int rev = 0;
		while(num>0)
		{
			int rem=num%10;
			rev = rev*10+rem;
			num/=10;
		}
		return rev;
	}
}