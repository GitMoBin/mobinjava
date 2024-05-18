import java.util.Scanner;
class vowelOrConconent
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the character : ");
		char ch = sc.next().charAt(0);
		
		System.out.println(((ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')?ch+ " : is a vowel." :ch+ " : is a conconent."));
	}
}