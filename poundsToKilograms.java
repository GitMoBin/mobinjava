import java.util.Scanner;
class poundsToKilograms
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number in pounds : ");
		double numberInPounds = sc.nextDouble();
		double kiloGram = 0.454* numberInPounds;

		System.out.println("The number " +numberInPounds +" in kilogram is "+kiloGram+" Kilograms.");




		
	}
}