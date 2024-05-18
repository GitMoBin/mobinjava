class Father
{
	String name;
	int age;
	String job;
	int noOfHouse;

	Father(String name, int age, String job, int noOfHouse)
	{
		super();
		this.name = name;
		this.age = age;
		this.job = job;
		this.noOfHouse = noOfHouse;
	}

	void displayFather()
	{
		System.out.println("###Father's Details###");
		System.out.println("Name : "+this.name);
		System.out.println("Age : "+this.age);
		System.out.println("Job : "+this.job);
		System.out.println("No Of Houses : "+this.noOfHouse);
	}

}
class Son1
{
	String sname;
	int sage;
	int shouse;

	Son1(String sname, int sage, int shouse,String name, int age, String job, int noOfHouse)
	{
		super(name,age,job,noOfHouse);
		this.sname = sname;
		this.sage = sage;
		this.shouse = shouse;
	}

	void displaySon1()
	{
		System.out.println();
		System.out.println("###Son's Details###");
		System.out.println("Name : "+this.sname);
		System.out.println("Age : "+this.sage);
		System.out.println("House : "+this.shouse);

	}

}
class Son2
{
	String s2name;
	String s2job;
	int s2age;
	int s2house;

	Son2(String s2name, String s2job, int s2age,int s2house,String name, int age, String job, int noOfHouse)
	{
		super(name,age,job,noOfHouse);
		this.s2name = s2name;
		this.s2job = s2job;
		this.s2age = s2age;
		this.s2house = s2house;

	}
	void displaySon2()
	{
		System.out.println();
		System.out.println("###Son2's Details###");
		System.out.println("Name : "+this.s2name);
		System.out.println("Job : "+this.s2job);
		System.out.println("Age : "+this.s2age);
		System.out.println("House : "+this.s2house);
	}

}
class Daughter
{
	String dname;
	int dage;
	String djob;
	int dhouse;

	Daughter(String dname, int dage, String djob,int dhouse,String name, int age, String job, int noOfHouse)
	{
		super(name,age,job,noOfHouse);
		this.dname = dname;
		this.dage = dage;
		this.djob = djob;
		this.dhouse = dhouse;
	}

	void displayDaughter()
	{
		System.out.println();
		System.out.println("###Daughter's Details###");
		System.out.println("Name : "+this.dname);
		System.out.println("Age : "+this.dage);
		System.out.println("Job : "+this.djob);
		System.out.println("House : "+this.dhouse);
	}

}
class HerirachicalInheritenace
{
	public static void main(String[] args) 
	{
		Father obj = new Father("Bhikan",55,"Police",5);
		obj.displayFather();
		Son1 obj1 = new Son1("Mobin",22,1);
		obj1.displaySon1();
		Son2 obj2 = new Son2("Matin","Police",20,1);
		obj2.displaySon2();
		Daughter obj3 = new Daughter("Asma",30,"Teacher");
		obj3.displayDaughter();
		
	}
}