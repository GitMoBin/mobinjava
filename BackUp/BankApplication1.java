import java.util.Scanner;
class BankApplication1
{
    static String name;
    static String address;
    static int age;
    static long phoneNo;
    static long AadharNo;
    static double balance;
    static int UPI;
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        for( ; ; )
        {
            System.out.println("----- WELCOME TO BLACK BANK -----");
            System.out.println();
            System.out.println("1.Create Account");
            System.out.println("2.Existing Account");
            System.out.print("Enter an option : ");
            int option = sc.nextInt();
            System.out.println();
            if(option==1)
            {

                switch(option)
                {
                case 1:
                    {
                        System.out.println("#### Create Account Module ####");
                        sc.nextLine();
                        System.out.print("Enter your name : ");
                        name = sc.nextLine();
                        System.out.print("Enter your address : ");
                        address = sc.nextLine();
                        System.out.print("Enter your age : ");
                        age = sc.nextInt();
                        System.out.print("Enter your phone number : ");
                        phoneNo = sc.nextLong();
                        System.out.print("Enter your Aadhar number : ");
                        AadharNo = sc.nextLong();
                        System.out.print("Enter deposit amount : ");
                        balance = sc.nextDouble();
                        System.out.print("Enter UPI number : ");
                        UPI = sc.nextInt();
                        System.out.println("Account created successfully.");
                        System.out.println();
                        break;
                    }
                case 2:
                    {
                        System.out.println();
                        System.out.println("#### Features ####");
                        System.out.println("1.Check Balance");
                        System.out.println("2. Deposit");
                        System.out.println("3.Withdraw");
                        System.out.println("4.Account Informtion");
                        System.out.println("5.Logout");
                        System.out.println();
                        System.out.println("Enter an option");
                        int opt = sc.nextInt();
                        switch(opt)
                        {
                        case 1:
                            {
                                System.out.println("$$$$ Check balance $$$$");
                                System.out.print("Enter your UPI pin : ");
                                int userPin = sc.nextInt();
                                if(userPin == UPI)
                                {
                                    System.out.println("Your acoount balance is : "+balance+ " rs");
                                }
                                else
                                {
                                    System.out.println("wrong UPI pin ");
                                }
                                break;
                            }
                        case 2:
                            {
                                System.out.println("$$$$ Deposit Amount $$$$");
                                System.out.print("Enter amount : ");
                                double amountDep = sc.nextDouble();
                                balance += amountDep;
                                System.out.println("Amount deposited successfully");
                                break;
                            }
                        case 3:
                            {
                                System.out.println("*Withdraw Amount*");
                                System.out.println();
                                System.out.print("Enter a amount : ");
                                double withDrawAmount = sc.nextDouble();
                                if(withDrawAmount <=balance)
                                {
                                    System.out.println("Amount withdraw successfully.");
                                    balance -= withDrawAmount;
                                }
                                else
                                {
                                    System.out.println("Insufficient balance");
                                }
                                break;
                            }
                        case 4:
                            {
                                System.out.println("*Account Info*");
                                System.out.println();
                                System.out.println("Account holder name : "+name);
                                System.out.println("Address : "+address);
                                System.out.println("Phone Number : "+phoneNo);
                                System.out.println("Aadhar Number : "+AadharNo);
                                break;
                            }
                        case 5:
                            {
                                System.exit(0);
                             }
                        default : System.out.println("Invalid Option");
                        break;
                    }
                    
                    
                    
                }
            }    
            }
            else
            {
                System.out.println("First Create a  acoount.");
            }
            
        }
    }
}