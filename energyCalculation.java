import java.util.Scanner;
class energyCalculation
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the amount of water in kilograms : ");
		double water = sc.nextDouble();
		System.out.print("Enter the initial temperature : ");
		double initialTemperature = sc.nextDouble();
		System.out.print("Enter the final temperature : ");
		double finalTemperature = sc.nextDouble();

		double energy = water * (finalTemperature - initialTemperature)*4184;
		System.out.println("The energy needed is : "+energy);
		
	}
}