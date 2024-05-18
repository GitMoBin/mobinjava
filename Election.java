import java.util.Scanner;
class Election
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your age : ");
		int age = sc.nextInt();
		if(age>=18)
		{
			System.out.println("Do you have voter ID (Y/N) : ");
			String voterId = sc.next().toLowerCase();
			if(voterId.equals("y"))
			{
				System.out.println("---WELCOME---");
				System.out.println("1. MIM");
				System.out.println("2. BJP");
				System.out.println("3. NCP");
				System.out.println("4. AAP");
				System.out.println("5. ShivSena");
				System.out.println("6. NCP");

				System.out.print("Enter the option to vote for goverment you want : ");
				String vote = sc.next().toUpperCase();
				if(vote.equals("MIM"))
				{
					System.out.println("You have voted to MIM.");
				}
				else if(vote.equals("BJP"))
				{
					System.out.println("You have voted to BJP.");
				}
				else if(vote.equals("NCP"))
				{
					System.out.println("You have voted to NCP.");
				}
				else if(vote.equals("AAP"))
				{
					System.out.println("You have voted to AAP.");
				}
				else if(vote.equals("ShivSena"))
				{
					System.out.println("You have voted to ShivSena.");
				}
				else if(vote.equals("NCP"))
				{
					System.out.println("You have voted to NCP.");
				}
				else
				{
					System.out.println("Invalid vote.");
				}
			}
			else
			{
				System.out.println("You need a voter ID.");
			}
		}
		else
		{
			System.out.println("You are not eligible to vote come after "+(18-age)+" years.");
		}
		
		
	}
}