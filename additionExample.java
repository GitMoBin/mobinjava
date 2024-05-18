import java.util.Scanner;
class additionExample
{
	public static void main (String [] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter first string : ");
	String a = sc.next();
	sc.nextLine();
	System.out.print("Enter second string : ");
	String b = sc.nextLine();
	System.out.println("First string - "+a);
	System.out.println("Second string - "+b);
	System.out.print("Enter character : ");
	char ch = sc.next().charAt(3);
	System.out.println("character is - "+ch);
	}
}