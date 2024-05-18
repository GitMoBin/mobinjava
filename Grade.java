import java.util.Scanner;
class Grade
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the percentage : ");
		Double percentage = sc.nextDouble();

		if(percentage<100)
		{
			System.out.println("First class with distinction.");
			System.out.println("Grade A++");
		}
		else if(percentage<90)
		{
			System.out.println("distinction.");
			System.out.println("Grade A+");
		}
		else if(percentage<75)
		{
			System.out.println("First class.");
			System.out.println("Grade A");
		}
		else if(percentage<60)
		{
			System.out.println("Second class.");
			System.out.println("Grade B");
		}
		else if(percentage<35)
		{
			System.out.println("Fail");
			System.out.println("Grade F");
		}
		else
		{
			System.out.println("Nothing to say.");
		}
	}
}