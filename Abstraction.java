abstract class RBI
{
	RBI()
	{
		super();
	}
	abstract void rateOfInterest();
	abstract void withdrawLimit();
	abstract void depositLimit();
}
abstract class SBI extends RBI{
	String accType;
	String userName;
	SBI(String accType, String userName)
	{
		super();
		this.accType = accType;
		this.userName = userName;
	}
	public void displayDetails()
	{
		System.out.println();
		System.out.println("Account Type: "+this.accType);
		System.out.println("User Name : "+this.userName);
	}
}
class Saving extends SBI
{
	Saving(String accType, String userName)
	{
		super(accType, userName);
	}
	void rateOfInterest()
	{
		System.out.println("Rate Of Interest : "+ 8.2+" %");
	}
	void withdrawLimit()
	{
		System.out.println("Withdarw Limit : "+ 50000+" Rs");
	}
	void depositLimit()
	{
		System.out.println("Deposit Limit : "+ 100000+" Rs");
	}
}
class Current extends SBI
{
	Current(String accType, String userName)
	{
		super(accType, userName);
	}
	void rateOfInterest()
	{
		System.out.println("Rate Of Interest : "+ 7.5+" %");
	}
	void withdrawLimit()
	{
		System.out.println("Withdarw Limit : "+ 100000+" Rs");
	}
	void depositLimit()
	{
		System.out.println("Deposit Limit : "+ 1000000+" Rs");
	}
}
class Abstraction
{
	public static void main(String[] args) 
	{
		Saving obj = new Saving("Saving","Ramesh");
		System.out.println("Saving");
		obj.displayDetails();
		obj.rateOfInterest();
		obj.withdrawLimit();
		obj.depositLimit();

		Current obj1 = new Current("Current","Suresh");
		System.out.println("Current");
		obj.displayDetails();
		obj1.rateOfInterest();
		obj1.withdrawLimit();
		obj1.depositLimit();		
	}
}