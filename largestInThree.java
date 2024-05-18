import java.util.Scanner;
class largestInThree
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the num1 : ");
		int num1 = sc.nextInt();

		System.out.print("Enter the num2 : ");
		int num2 = sc.nextInt();

		System.out.print("Enter the num3 : ");
		int num3 = sc.nextInt();

		System.out.println("Largest number amoung three is :"+((num1>num2)?((num1>num3)?(num1):(num3)):((num2>num3)?(num2):(num3))));
		
	}
}