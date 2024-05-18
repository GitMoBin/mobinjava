import java.util.Scanner;
class donateBlood
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age : ");
		int age = sc.nextInt();
		if(age>20)
		{
			System.out.println("Have you consume alcohol or cigar(yes/no) :");
			String nasha = sc.next().toLowerCase();
			if(nasha.equals("yes"))
			{
				System.out.println("You can not donate blood.");
			}else{
				System.out.println("Enter your weight : ");
				double weight = sc.nextDouble();
				if (weight>=50) 
			{
				System.out.println("We can pump blood.");	
			}else{
				System.out.println("We can not pump blood.");
			}
			}
			
		}else{
			System.out.println("You are child try after "+(20-age)+" years.");
		}
	}
}