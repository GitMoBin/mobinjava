import java.util.*;
class laptop
{
	String brand;
	int ManufactureYear;
	double price;

	laptop(String brand, int ManufactureYear, double price)
	{
		this.brand = brand;
		this.ManufactureYear = ManufactureYear;
		this.price = price;
	}

	public void displayLaptop()
	{
		System.out.println();
		System.out.println("Brand : "+this.brand);
		System.out.println("Manufactured Year : "+this.ManufactureYear+"k");
		System.out.println("Price : "+this.price);
	}
}

class studentLaptop extends laptop
{
	String [] features;
	String model;

	studentLaptop(String [] features, String model, String brand, int ManufactureYear, double price)
	{
		super(brand, ManufactureYear, price);
		this.features = features;
		this.model = model;
	}

	public void displaystudentLaptop()
	{
		System.out.println();
		System.out.println("###*** STUDENT'S LAPTOP ***###");
		System.out.println("Features of Student Laptop : "+ Arrays.toString(this.features));
	}
}

class SingleLeveldriver1
{
	public static void main(String[] args) 
	{
		String [] features = {"1.Portablility","2.Performance","3.Affordability","4.Connectivity"};
		studentLaptop obj = new studentLaptop(features,"HP Dual i5 S","HP",2022,5.4);	
		obj.displayLaptop();
		obj.displaystudentLaptop();
	}
}