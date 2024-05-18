import java.util.Scanner;
class joinArmy
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age : ");
		int age = sc.nextInt();

		if(age>=18)
		{
			System.out.print("Enter your height : ");
			int height = sc.nextInt();
			if(height>=162)
			{
				System.out.print("Enter your weight : ");
				int weight = sc.nextInt();
				if(weight>=56)
				{
					System.out.println("Congrulations you are eligible to join indian army.");
				}
				else
				{
					System.out.println("You need to increase the weight and come back.");
				}
			}
			else
			{
				System.out.println("You need to increase your height and come back.");
			}
		}
		else {
			System.out.println("You are eligible after "+(18-age)+" years.");
		}
		
	}
}