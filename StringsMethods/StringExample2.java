import java.util.*;
class StringExample2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word : ");
		String str = sc.next();
		System.out.print("Enter Character to remove : ");	
		String ch = sc.next();

		String modified = str.replace(ch,"");
		System.out.println(modified);

	}
}