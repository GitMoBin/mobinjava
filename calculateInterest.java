import java.util.Scanner;
class calculateInterest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the balance : ");
		long balance = sc.nextLong();
		System.out.print("Enter the interest rate : ");
		double interestRate = sc.nextDouble();
		double interest = balance*(interestRate/1200);
		System.out.println("The interest is : "+interest);

		
	}
}