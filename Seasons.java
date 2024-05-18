import java.util.Scanner;
class Seasons
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a month :");
		String month = sc.next().toUpperCase();
		switch(month)
		{
			case "OCT":
			case "NOV":
			case "DEC":
			case "JAN":System.out.println(month+" is winter.");break;

			
			case "FEB":
			case "MAR":
			case "APR":
			case "MAY":System.out.println(month+" is summer.");break;

			case "JUN":
			case "JUL":
			case "AUG":
			case "SEP":System.out.println(month+" is rainy.");break;	
			default: System.out.println("Invalid input.");
		}

		
	}
}