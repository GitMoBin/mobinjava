import java.util.Scanner;
class   
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the monthly target : ");
		Scanner sc = new Scanner(System.in);
		int target = sc.nextInt();
		System.out.print("Enter the current pay : ");
		double pay = sc.nextDouble();
		double highPay = (pay+pay*3/100);
		double lowPay =(pay+pay*1/100);

		if(target>=90)
		{
			System.out.println("Your pay is increased by "+ highPay);
		}else{
			System.out.println("Your pay is increased by "+ lowPay);
		}
		
	}
}