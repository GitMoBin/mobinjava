class Bank
{
	long accountNo;
	String branch;
	String address;
	private double balance;
	private int pwd;

	Bank(long accountNo, String branch, String address, double balance, int pwd)
	{
		this.accountNo = accountNo;
		this.branch = branch;
		this.address = address;
		this.balance = balance;
		this.pwd = pwd;
	}

	public double getBalance()
	{
		return balance;
	}

	public int getPwd()
	{
		return pwd;
	}

	public void setPwd(int updatePwd)
	{
		this.pwd = updatePwd;
	}

	public void displayBank()
	{
		System.out.println("***Bank Details***");
		System.out.println("Account Number: "+this.accountNo);
		System.out.println("Branch : "+this.branch);
		System.out.println("Address : "+this.address);
		System.out.println("Balance : "+this.balance);
		System.out.println("Password : "+this.pwd);
	}

	
}
class BankDriver
{
	public static void main(String[] args) 
	{
		Bank obj = new Bank(1234567890,"Pune","Deccan Qspider's",5500,123);
		// obj.displayBank();
		obj.getBalance();
		obj.getPwd();

	}
}