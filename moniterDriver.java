class moniter
{
	String brand;
	String model;
	String type;
	double price;
	String colour;
	CPU cpu = new CPU(48,16.7, "Anti glare","Full HD", 40);

	moniter(String brand, String model, String type, double price, String colour)
	{
		this.brand = brand;
		this.model= model;
		this.type= type;
		this.price = price;
		this.colour = colour;
	}

	public void displayMoniter()
	{
		System.out.println("*** MONITOR DETAILS ***");
		System.out.println("Brand : "+this.brand);
		System.out.println("Model : "+this.model);
		System.out.println("Type : "+this.type);
		System.out.println("Price : "+this.price);
		System.out.println("Colour : "+this.colour);
	}

}

class CPU
{
	int powerConsumption;
	double noOfColours;
	String displayCoating;
	String screenresolution;
	int operatingTemperature;

	CPU(int powerConsumption, double noOfColours, String displayCoating, String screenresolution, int operatingTemperature)
	{
		this.powerConsumption = powerConsumption;
		this.noOfColours = noOfColours;
		this.displayCoating = displayCoating;
		this.screenresolution = screenresolution;
		this.operatingTemperature = operatingTemperature;
	}

	public void displayCPU()
	{
		System.out.println("*** CPU DETAILS ***");
		System.out.println("Power Consumption : "+this.powerConsumption);
		System.out.println("No Of Colours : " +this.noOfColours);
		System.out.println("Display Coating : " +this.displayCoating);
		System.out.println("Screen resolution : "+this.screenresolution);
		System.out.println("Operating Temperture : "+this.operatingTemperature);
	}

}

class moniterDriver
{
	public static void main(String[] args) {
		moniter obj = new moniter("SAMSUNG","SAM2021","VA PANEL",10599,"BLACK");
		obj.displayMoniter();
		obj.cpu.displayCPU();
		
	}
}