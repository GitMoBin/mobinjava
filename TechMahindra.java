import java.util.Scanner;
class TechMahindra
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		System.out.print("Enter a key : ");
		int key = sc.nextInt();
		System.out.print(num+" "+ rotate(num,key));
	}
	public static int rotate(int num, int key)
	{
		String str = ""+num;
		int lngth = str.length();
		String str1 = "";
		for(int i=1; i<key; i++)
			str+=num;
		for(int i=0; i<lngth; i++)
			str1+=str.charAt(i+key);
		return Integer.parseInt(str1);
	}
}
