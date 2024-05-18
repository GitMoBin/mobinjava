import java.util.Scanner;
class evenOddWithoutModulus
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(((num/2)*2==num)?"Even":"Odd");
		System.out.println(((num/2.0)==(num/2))?"Even":"Odd");
		
	}

}