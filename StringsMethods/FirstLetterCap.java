import java.util.*;
class FirstLetterCap
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a name : ");
		String name = sc.next();

		String firstLetter = name.substring(0,1).toUpperCase();
		System.out.println("First letter is :"+firstLetter);

		String remainingLetter = name.substring(1,name.length());
		System.out.println("Remaining letter is :"+remainingLetter); 

		String merge = firstLetter.concat(remainingLetter);
		System.out.println("New name is : "+merge);
		
	}
}