import java.util.Scanner;
class drivingLicences
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age : ");
		int age = sc.nextInt();

		if(age>=18)
		{
			System.out.print("Have you given RTO test (yes/no):");
			String test = sc.next().toLowerCase();
			if(test.equals("yes"))
			{
				System.out.print("Enter the marks :");
				int marks = sc.nextInt();
				if(marks >=60)
				{
					System.out.println("You have passed test with more than 60 marks you are eligible for driving licences.");
				}
				else
				{
					System.out.println("You need to reappeared for the test.");
				}
			}
			else
			{
				System.out.println("You have to give The RTO test.");
			}

		}
		else
		{
			System.out.println("You can give test after "+(age-18)+"years.");
		}
		
	}
}