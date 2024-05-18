import java.util.Scanner;
class naturalNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		if(num>0)
		{
			System.out.println("number is positive.");
		}else{
			System.out.println("number is negative.");
		}


		
	}
}