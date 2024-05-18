class Car
{
	String brand;
	String model;
	String type;
	double price;
	int seatingCapacity;
	Engine engine;

	Car(String brand, String model, String type, double price, int seatingCapacity,double horsePower, double capacityLiter, String engineType, double mileage, int noOfPistons)
	{
		this.brand = brand;
		this.model = model;
		this.type = type;
		this.price = price;
		this.seatingCapacity = seatingCapacity;
		this.engine = new Engine(horsePower, capacityLiter, engineType, mileage, noOfPistons);
	}

	public void displayCar()
	{
		System.out.println("###CAR'S DETAILS###");
		System.out.println("Brand : "+this.brand);
		System.out.println("Model : "+this.model);
		System.out.println("Type : "+this.type);
		System.out.println("Price : "+this.price);
		System.out.println("Seating Capacity : "+this.seatingCapacity);
	}
}
class Engine
{
	double horsePower;
	double capacityLiter;
	String engineType;
	double mileage;
	int noOfPistons;

	Engine(double horsePower, double capacityLiter, String engineType, double mileage, int noOfPistons)
	{
		this.horsePower = horsePower;
		this.capacityLiter = capacityLiter;
		this.engineType = engineType;
		this.mileage = mileage;
		this.noOfPistons = noOfPistons;
	}

	public void displayEngine()
	{
		System.out.println("###ENGINE'S DETAILS###");
		System.out.println("Horse Power : "+this.horsePower);
		System.out.println("Capacity Liter : "+this.capacityLiter);
		System.out.println("engine Type : "+this.engineType);
		System.out.println("Mileage : "+this.mileage);
		System.out.println("No Of Pistons : "+this.noOfPistons );
	}

}
class carDriver1
{
	public static void main(String[] args) 
	{
		Car obj = new Car("TATA","NEXON","SUV",900000,5,120,1.2,"Petrol",24, 4);
		obj.displayCar();
		obj.engine.displayEngine();	
	}
}