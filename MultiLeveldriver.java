import java.util.*;
class Programminglanguage
{
	String type;
	String level;
	int inventedYear;


	Programminglanguage(String type, String level, int inventedYear)
	{
		super();
		this.type = type;
		this.level = level;
		this.inventedYear = inventedYear;
	}

	public void displayProgramminglanguage()
	{
		System.out.println("### Programming Language Details ###");
		System.out.println("Type : "+this.type);
		System.out.println("Level : "+this.level);
		System.out.println("Invened Year : "+this.inventedYear);
	}
}
class Java extends Programminglanguage
{
	String [] features;
	boolean platformIndependent;

	Java(String [] features, boolean platformIndependent,String type, String level, int inventedYear)
	{
		super(type, level, inventedYear);
		this.features = features;
		this.platformIndependent = platformIndependent;
	}
	public void displayJava()
	{
		System.out.println();
		System.out.println("### Java Details ###");
		System.out.println("Is it platform independent : "+this.platformIndependent);
		System.out.println("features of JAVA : "+ Arrays.toString(this.features));
	}

}
class Tokens extends Java
{
	int noOfTypes;

	Tokens(int noOfTypes,String [] features, boolean platformIndependent,String type, String level, int inventedYear)
	{
		super(features,platformIndependent,type, level, inventedYear);
		this.noOfTypes = noOfTypes;
	}
	void Types()
	{
		System.out.println();
		System.out.println("***Types Of Tokens***");
		System.out.println("1.Keywords");
		System.out.println("2.Identifiers");
		System.out.println("3.Operators");
		System.out.println("4.Seperators");
		System.out.println("5.literals");
		System.out.println("6.Comments");
	}
	public void displayTokens()
	{
		System.out.println();
		System.out.println("### Tokens ####");
		System.out.println("No of Types in Tokens : "+this.noOfTypes);
		Types();
	}

}
class Keywords extends Tokens
{
	int totalKeywords;
	int deptKeywords;

	Keywords(int totalKeywords, int deptKeywords,int noOfTypes,String [] features, boolean platformIndependent,String type, String level, int inventedYear)
	{
		super(noOfTypes, features, platformIndependent,type,level,inventedYear);
		this.totalKeywords = totalKeywords;
		this.deptKeywords = deptKeywords;
	}
	public void displayKeywords()
	{
		System.out.println();
		System.out.println("### Keywords ###");
		System.out.println("Total keywords in java : "+this.totalKeywords +"+");
		System.out.println("Depricated Keywords in java : "+this.deptKeywords);
	}

}
class MultiLeveldriver
{
	public static void main(String[] args) 
	{
		String [] features = {"1. Multithreaded","2.Secure and robust","3.Portable","4.Dynamic","5.High Performance"};
		Keywords obj = new Keywords(52,2,6,features,true,"Object Orient","High Level",1991);
		obj.displayProgramminglanguage();
		obj.displayJava();
		obj.displayTokens();
		obj.displayKeywords();
	}
}