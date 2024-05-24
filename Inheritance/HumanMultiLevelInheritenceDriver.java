class Human
{
	String name;
	String gender;

	Human(String name, String gender)
	{
		super();
		this.name = name;
		this.gender = gender;
	}
	void eat()
	{
		System.out.println("Human Can Eat.");
	}
	void walk()
	{
		System.out.println("Human Can Walk.");
	}
	void think()
	{
		System.out.println("Human Can Think.");
	}
	void speak()
	{
		System.out.println("Human Can Speak.");
	}

	void displayHuman()
	{
		System.out.println();
		System.out.println("###***Human Details***###");
		System.out.println("Name : "+this.name);
		System.out.println("Gender : "+this.gender);
		eat();
		walk();
		think();
		speak();
	}
}

class Graduation extends Human
{
	String course;
	int duration;
	String branch;
	String university;
	int yop;

	Graduation(String course, int duration, String branch, String university, int yop,String name, String gender)
	{
		super(name,gender);
		this.course = course;
		this.duration = duration;
		this.branch = branch;
		this.university = university;
		this.yop = yop;
	}

	void displayGraduation()
	{
		System.out.println();
		System.out.println("###*** Graduation details ***###");
		System.out.println("Course : "+this.course);
		System.out.println("Duration : "+this.duration);
		System.out.println("branch : "+this.branch);
		System.out.println("University : "+this.university);
		System.out.println("Year Of Passing : "+this.yop);
	}
}

class PostGraduation extends Graduation
{
	String specialization;
	int durationpg;
	int yoppg;
	String universitypg;

	PostGraduation(String specialization, int durationpg, int yoppg, String universitypg,String course, int duration, String branch, String university, int yop,String name, String gender)
	{
		super(course,duration,branch,university,yop,name,gender);
		this.specialization = specialization;
		this.durationpg = durationpg;
		this.yoppg = yoppg;
		this.universitypg = universitypg;
	}
	void displayPostGraduation()
	{
		System.out.println();
		System.out.println("###***Post Graduation Details***###");
		System.out.println("Specialization : "+this.specialization);
		System.out.println("Duration : "+this.durationpg);
		System.out.println("Year Of Passing : "+this.yoppg);
		System.out.println("University : "+this.universitypg);
	}
}

class Job extends PostGraduation
{
	String company;
	double salary;
	String designation;
	String location;

	Job(String company, double salary, String designation, String location,String specialization, int durationpg, int yoppg, String universitypg,String course, int duration, String branch, String university, int yop,String name, String gender)
	{
		super(specialization,durationpg,yoppg,universitypg,course,duration,branch, university,yop,name,gender);
		this.company = company;
		this.salary = salary;
		this.designation = designation;
		this.location = location;
	}
	void displayJob()
	{
		System.out.println();
		System.out.println("###***Job Details***###");
		System.out.println("Company : "+this.company);
		System.out.println("Salary : "+this.salary);
		System.out.println("Designation : "+this.designation);
		System.out.println("Location : "+this.location);
	}
}
class HumanMultiLevelInheritenceDriver
{
	public static void main(String[] args) 
	{
		Job obj = new Job("TCS",7.2,"Software developer","Pune","Masters In Software Developer",2,2026,"SPPU","Bachelors Of Engineering",4,"Electrical","SPPU",2024,"Mobin","Male");
		obj.displayHuman();
		obj.displayGraduation();
		obj.displayPostGraduation();
		obj.displayJob();
		
	}
}
