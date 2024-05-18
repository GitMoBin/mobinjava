import java.util.Scanner;
class PrimeNumRecursion
{
	static int num;
	static int i=2;
	static boolean flag = true;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		num=sc.nextInt();
		primeNum();	
		System.out.println(flag?"Prime":"Not Prime");
	}
	public static void primeNum()
	{
		if(i==num)
			return;
		if(num%i==0)
		{
			flag = false;
			return;
		}
		i++;
		primeNum();
	}
}