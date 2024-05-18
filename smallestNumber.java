import java.util.Scanner;
class smallestNumber
{
	public static void main(String[] args) {
		System.out.print("Enter the num1: ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.print("Enter the num2: ");
		int num2 = sc.nextInt();
		int min = (num1>num2)?num2:num1;
		System.out.println((num1+" , "+num2 + " : smaller amoung num1 and num2 is "+min));
	}
}

