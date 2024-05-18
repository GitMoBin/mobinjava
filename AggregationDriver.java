class University
{
	String name;
	String universityCode;
	int noOfColleges;
	String type;
	int establishedYear;
	int course;
	College college;

	University(String name, String universityCode, int noOfColleges, String type, int establishedYear, int course)
	{
		this.name = name;
		this.universityCode = universityCode;
		this.noOfColleges = noOfColleges;
		this.type = type;
		this.establishedYear = establishedYear;
		this.course = course;
	}

	public void displayUniversity()
	{
		System.out.println();
		System.out.println("*** UNIVERSITY DETAILS ***");
		System.out.println("Name : "+this.name);
		System.out.println("University Code : "+this.universityCode);
		System.out.println("No of Colleges : "+this.noOfColleges);
		System.out.println("Type : "+this.type);
		System.out.println("establiched Year : "+this.establishedYear);
		System.out.println("Courses : "+this.course);
	}

	public void createInstanceOfCollege(String name,String collegeCode,String address,int noOfDepartment,int staffCount,char grade)
	{
		college = new College(name,collegeCode,address, noOfDepartment, staffCount, grade);
	}

}

class College
{
	String name;
	String collegeCode;
	String address;
	int noOfDepartment;
	int staffCount;
	char grade;
	Department department;

	College(String name,String collegeCode,String address,int noOfDepartment,int staffCount,char grade)
	{
		this.name = name;
		this.collegeCode = collegeCode;
		this.address = address;
		this.noOfDepartment = noOfDepartment;
		this.staffCount = staffCount;
		this.grade = grade;
	}

	public void displayCollege()
	{
		System.out.println();
		System.out.println("*** COLLEGE DETAILS ***");
		System.out.println("College Name : "+this.name);
		System.out.println("College Code : "+this.collegeCode);
		System.out.println("College Address : "+this.address);
		System.out.println("No Of Departments : "+this.noOfDepartment);
		System.out.println("Staff Count : "+this.staffCount);
		System.out.println("Grade : "+this.grade);
	}

	public void createInstanceOfDepartment(String name,String hod,int classRooms,int noOfStaffs,int noOfSubjects)
	{
		department = new Department(name,hod,classRooms,noOfStaffs,noOfSubjects);
	}

}

class Department
{
	String name;
	String hod;
	int classRooms;
	int noOfStaffs;
	int noOfSubjects;
	Teacher teacher;

	Department(String name,String hod,int classRooms,int noOfStaffs,int noOfSubjects)
	{
		this.name = name;
		this.hod = hod;
		this.classRooms = classRooms;
		this.noOfStaffs = noOfStaffs;
		this.noOfSubjects = noOfSubjects;
	}

	public void displayDepartment()
	{
		System.out.println();
		System.out.println("*** DEPARTMENT DETAILS ***");
		System.out.println("Department Name : "+this.name);
		System.out.println("Hod Name : "+this.hod);
		System.out.println("No of classrooms : "+this.classRooms);
		System.out.println("No of Staffs : "+this.noOfStaffs);
		System.out.println("No of  subjects : "+this.noOfSubjects);
	}

	public void createInstanceOfTeacher(String name, String subjects, long phoneNumber, String qualifaction, double experience)
	{
		teacher = new Teacher(name,subjects,phoneNumber,qualifaction,experience);
	}

}

class Teacher
{
	String name;
	String subjects;
	long phoneNumber;
	String qualifaction;
	double experience;

	Teacher(String name, String subjects, long phoneNumber, String qualifaction, double experience)
	{
		this.name = name;
		this.subjects = subjects;
		this.phoneNumber = phoneNumber;
		this. qualifaction = qualifaction;
		this.experience = experience;
	}

	public void displayTeacher()
	{
		System.out.println();
		System.out.println("*** TEACHERS DETAILS ***");
		System.out.println("Teacher's name: "+this.name);
		System.out.println("Subject : "+this.subjects);
		System.out.println("Phone Number : "+this.phoneNumber);
		System.out.println("Qualification : "+this.qualifaction);
		System.out.println("Experience : "+this.experience);
	}

}
class AggregationDriver
{
	public static void main(String[] args) 
	{
		University obj = new University("SPPU","UNI123",1100,"Goverment",1950,300);
		obj.displayUniversity();
		obj.createInstanceOfCollege("SRES College","SRES@123","Kopagraon,ahmednagar",20,40,'A');
		obj.college.displayCollege();
		obj.college.createInstanceOfDepartment("Electrical","Dr.D.B.Pardeshi",20,30,50);
		obj.college.department.displayDepartment();
		obj.college.department.createInstanceOfTeacher("P.V.Thokal","BEEE",9876543210l,"Phd",5.6);
		obj.college.department.teacher.displayTeacher();
		
	}
}