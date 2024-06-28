// Write a java program to count the user entered character for the  user given string.
import java.util.*;
class StringExample1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = sc.next();
		
		System.out.print("Enter Character to get count: ");
		char ch = sc.next().charAt(0);
		int count=0;

		for (int i=0; i<str.length(); i++) 
		{
			char ch2 = str.charAt(i);
			if(ch==ch2)
			{
				count++;
			}	
		}
		System.out.println("Count of "+ ch +" is "+ count);
	}
}