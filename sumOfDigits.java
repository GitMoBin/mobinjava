import java.util.Scanner;
class sumOfDigits
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int num1 = num;
		int sum = 0;
		sum = sum + num%10;
		num = num/10;
		sum = sum + num%10;
		num = num/10;
		sum = sum + num%10;
		System.out.println("The sum of digits is "+sum+ " and the number is "+ num1);
	}
}