import java.util.Scanner;
class eligible
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter age : ");
		int age = sc.nextInt();

		System.out.print("Enter property : ");
		double property = sc.nextDouble();
		
		System.out.print("Enter surname : ");
		String surname = sc.next().toUpperCase();

		if((age>=21 && property >= 10000000)||(surname.equals("AMBANI")))
		{
			System.out.println("eligible");
		}else{
			System.out.println("Not eligible");
		}
		
	}
}