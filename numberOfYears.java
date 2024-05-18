import java.util.Scanner;
class numberOfYears
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of minutes : ");
		long minutes = sc.nextLong();
		long minutesInYear = 525600;
		int minutesInDay = 1440;
		long days = minutes/minutesInDay;
		long year= minutes/minutesInYear;

		long remainingMinutes = days %  minutesInYear;

		System.out.println("The minutes "+minutes+ " is approximately "+ year+" years and "+remainingMinutes+"days.");
		
	}
}