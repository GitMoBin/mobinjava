import java.util.*;
class ProgrammingLanguage
{
	String type;
	String level;
	int inventedYear;
	String founderName;
	double latestVersion;
	String extension;

	ProgrammingLanguage(String type, String level, int inventedYear, String founderName, double latestVersion, String extension)
	{
		super();
		this.type = type;
		this.level =level;
		this. inventedYear = inventedYear;
		this.founderName = founderName;
		this.latestVersion = latestVersion;
		this.extension = extension;
	}

	public void displayProgrammingLanguage()
	{

		System.out.println();
		System.out.println("Type : "+this.type);
		System.out.println("Level : "+this.level);
		System.out.println("Invented Year : "+this.inventedYear);
		System.out.println("Founder name : "+this.founderName);
		System.out.println("Latest Version : "+this.latestVersion);
		System.out.println("Extension : "+this.extension);
	}
}

class Java extends ProgrammingLanguage
{
	String [] features;
	boolean platformIndependent;

	Java(String [] features, boolean platformIndependent,String type, String level, int inventedYear, String founderName, double latestVersion, String extension)
	{
		super(type, level, inventedYear, founderName, latestVersion, extension);
		this.features = features;
		this.platformIndependent = platformIndependent;
	}

	public void displayJava()
	{
		System.out.println();
		System.out.println("###*** JAVA ***###");
		System.out.println("Is it platform independent : "+this.platformIndependent);
		System.out.println("features of JAVA : "+ Arrays.toString(this.features));
	}

}

class SingleLeveldriver
{
	public static void main(String[] args) 
	{
		String [] features = {"1. Multithreaded","2.Secure and robust","3.Portable","4.Dynamic","5.High Performance"};
		Java obj = new Java(features, true,"Object Oriented","high level",1991,"James Gosling",1.22,".java");
		obj.displayProgrammingLanguage();
		obj.displayJava();	
	}
}

