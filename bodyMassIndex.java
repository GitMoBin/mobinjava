import java.util.Scanner;
class bodyMassIndex
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your weigth in pounds : ");
		double weigth = sc.nextDouble();
		System.out.print("Enter heights in inches : ");
		double height = sc.nextDouble();

		double weightInKg = (weigth * 0.45359237) ;
		double heightInMeter = (height * 0.0254);

		double BMI = (weightInKg/(heightInMeter*heightInMeter));
		System.out.println("The Body mass index is "+BMI);



	}
}