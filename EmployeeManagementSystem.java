import java.util.Scanner;
class EmployeeManagementSystem
{
	static String ename;
	static int eid;
	static String erole;
	static double esal;

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("---WELCOME---");
		System.out.println();
		features:
		for (; ; ) 
		{
			System.out.println();
			System.out.println("*** FEATURES ***");
			System.out.println("1.Add New Employee");
			System.out.println("2.View Employee");
			System.out.println("3.Edit Employee");
			System.out.println("4.Exit");
			System.out.println();
			System.out.print("Enter an option : ");
			int opt = sc.nextInt();
			switch(opt)
			{
				case 1:{
					addNewEmployee();
					break;
				}
				case 2:{
					viewEmployee(1);
					break;
				}
				case 3:{
					System.out.println("###Rename Profile###");
					editEmployee(); 
					break;
					}
				case 4:{
					System.exit(0);
					break;
				}
				default : {
					System.out.println("Invalid Option");
				}
			}	
		}
	}
	public static void addNewEmployee()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("## Enter New Employee Data ##");
		System.out.print("Employee name : ");
		ename = sc.nextLine();
		System.out.print("Employee ID : ");
		eid = sc.nextInt();
		Scanner s = new Scanner(System.in);
		System.out.print("Employee Role : ");
		erole = s.nextLine();
		System.out.print("Employee Salary : ");
		esal = s.nextDouble();
	}
	public static void viewEmployee(int eid1)
	{
		if(eid==eid1)
		{
			System.out.println("Employee Data");
			System.out.println("Name : "+ename);
			System.out.println("Employee ID : "+eid);
			System.out.println("Role : "+erole);
			System.out.println("Salary : "+esal);
		}else{
			System.out.println("Wromg Eid");
		}
	}
	public static void editEmployee()
	{
		Scanner sc = new Scanner(System.in);
		feature:
		for (; ; ) 
		{
		System.out.println("1. Edit Name");
		System.out.println("2. Edit Role");
		System.out.println("3. Edit Salary");
		System.out.println();
		System.out.print("Enter an option :");
		int opt1 = sc.nextInt();
		switch(opt1)
		{
			case 1:{
				nname();
				break feature;																
			}
			case 2:{
				nrole();
				break feature;
			}
			case 3:{
				nsal();
				break feature;
			}
		}		
		}
		
	}
	public static void nname()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter new name :");
		String nname = sc.nextLine();
		ename = nname;
		System.out.println("Name updated");
	}
	public static void nrole()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter new role :");
		String nrole = sc.nextLine() ;
		// sc.nextLine();
		erole=nrole;
		System.out.println("Role updated");
	}
	public static void nsal()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter new salary : ");
		int nsal = sc.nextInt();	
		// sc.nextLine();
		esal=nsal;
		System.out.println("Salary updated");
	}
} 