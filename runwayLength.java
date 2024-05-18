import java.util.Scanner;
class runwayLength
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the velocity in meters/second: ");
		int velocity = sc.nextInt();
		System.out.print("Enter the acceleration in meters/second: ");
		double acceleration = sc.nextDouble();

		double length = (velocity*velocity)/(2*acceleration);
		System.out.println("Enter the minimum length for this airplane is : "+length);
	}
}