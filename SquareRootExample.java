import java.util.Scanner;
class SquareRootExample
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int newNum = num+1;
		boolean flag = false;
		int sqrrt = 0;
		for(int i=1;i<=newNum/2;i++)
		{
			if(i*i==newNum)
			{
				flag=true;
				sqrrt = i;
				break;
			}
		}
		if(flag)
		{
			System.out.println(newNum +" is a sunny number.");
		}else{
			System.out.println(newNum+" is not.");
		}
		
	}
}