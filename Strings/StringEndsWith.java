import java.util.*;
class StringEndsWith
{
	static String str;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		str = sc.nextLine();

		System.out.print("Enter string to check : ");
		String str1 = sc.next();

		boolean op = userEndsWith(str1);
		System.out.println(str+" : "+op);
	}
	public static boolean userEndsWith(String str1)
	{
		boolean flag = true;
		for(int i=str1.length()-1; i>0; i--)
		{
			char ch = str.charAt(i);
			System.out.println(ch);
			if(ch!=str.charAt(i))
			{
				flag = false;
				break;
			}
		}
		return flag;
	}
	
}