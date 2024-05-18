import java.util.Scanner;
class evenAndOdd
{
    public static void main(String [] args)
    {
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println((num%2==0)?num+"Number is even":num+"Number is odd");
    }
}