import java.util.Scanner;
class largestNumber
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the num1 : ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter the num2 : ");
        int num2 = sc.nextInt();
        
        int max = (num1>num2)?num1:num2;
        System.out.println((num1 +" and "+ num2+ ": largest number from num1 and num2 is "+max));
    }
}