import java.util.Scanner;
class areaOfhexagon
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the side of hexagon : ");
		double side = sc.nextDouble();
		double area = 3*(1.73205080757/2)*(side*side);
		System.out.println("Area of hexagon is :  "+area);
		
	}
}