import java.util.Scanner;
class futureInvestmentValue
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter investment amount : ");
		double amount = sc.nextDouble();
		System.out.print("Enter annual interest rate in percentage : ");
		double interestRate = sc.nextDouble();
		System.out.print("Enter number of year's : ");
		int years = sc.nextInt();
		
		double futureInvestmentValue = (amount+(amount/100)*4.25)*years;
		System.out.println("The future investment value is : "+futureInvestmentValue);


		
	}
}