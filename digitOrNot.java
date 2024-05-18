import java.util.Scanner;
class digitOrNot
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the digit : ");
		int num= sc.nextInt();
		System.out.println((num>=0 && num<=9)?num +" is a digit.":num +" is not a digit.");
		
	}
}