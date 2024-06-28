// write a java program to get the asci vaues of all the charatre of string dynimically
import java.util.*;
class ExampleAsciValue
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = sc.next();	

		for (int i=0; i<str.length(); i++ ) 
		{
			System.out.println(str.charAt(i) +" : " +str.codePointAt(i));	
		}
	}
}