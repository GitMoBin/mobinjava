import java.util.Scanner;
class acceleration
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter starting velocity : ");
		double startingVelocity = sc.nextDouble();
		System.out.print("Enter ending velocity : ");
		double endingVelocity = sc.nextDouble();

		System.out.print("Enter time pan in sec : ");
		double timeSpan = sc.nextDouble();

		double averageAcceleration = (endingVelocity - startingVelocity)/ timeSpan;
		System.out.println("Average acceleration is "+averageAcceleration);
	}
}