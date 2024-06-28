import java.util.*;
class StringStarsWith
{
	static String str;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		str = sc.nextLine();
		String op = userStarsWith();
		System.out.println(str+" : "+op);
	}
