import java.util.Scanner;
class calculateTips
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter subtotal : ");
		double subTotal = sc.nextDouble();

		System.out.println("Enter tip rate :");
		double tipRate = sc.nextDouble();

		double total = subTotal + tipRate *(subTotal/100) ;
		System.out.println("Subtotal is"+subTotal+" and the tiprate");
		
	}
}