import java.util.Scanner;
class costOfDriving
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the driving distance :");
		double distance = sc.nextDouble();
		System.out.print("Enter the miles per gallon : ");
		double milesPerGallon = sc.nextDouble();
		System.out.print("Enter the price per gallon : ");
		double pricePerGallon = sc.nextDouble();
		double costOfDriving = (distance/(milesPerGallon/pricePerGallon));
		System.out.println("Total driving cost is : "+costOfDriving);
		

		
	}
}