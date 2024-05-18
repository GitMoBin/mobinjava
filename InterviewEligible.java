import java.util.Scanner;
class InterviewEligible
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the percentage : ");
		Scanner sc = new Scanner(System.in);
		int percentage = sc.nextInt();
		if(percentage>=60)
		{
			System.out.println("Student is eligible for interview.");
		}else{
			System.out.println("Student is not eligible for interview.");
		}

		
	}
}