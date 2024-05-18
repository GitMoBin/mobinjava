import java.util.Scanner;
class feetToMeters
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value for feet : ");
		double valueInFeet = sc.nextDouble();
		
		double meters = 0.305*valueInFeet;

		System.out.println("Tha value of "+ valueInFeet+ " feet is " +meters +" meters");
		
	}
}