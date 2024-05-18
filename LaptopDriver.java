class Laptop
{
	String brand;
	String modelNumber;
	double price;
	int ram;
	int rom;
	String processor;
	String type;
	public void displayLaptop()
	{
		System.out.println("***LAPTOP DETAILS***");
		System.out.println("Brand : "+brand);
		System.out.println("Model Number : "+modelNumber);
		System.out.println("Price : "+price);
		System.out.println("RAM : "+ram);
		System.out.println("ROM : "+rom);
		System.out.println("Processor : "+processor);
		System.out.println("Type : "+type);
	}
}
class LaptopDriver
{
	public static void main(String[] args) {
		Laptop obj = new Laptop();
		obj.brand = "HP";
		obj.modelNumber = "HP123";
		obj.price = 50000;
		obj.ram = 16;
		obj.rom = 512;
		obj.processor = "i7";
		obj.type = "Gaming";
		obj.displayLaptop();

		Laptop obj2 = new Laptop();
		obj.brand = "HP";
		obj.modelNumber = "HP123";
		obj.price = 60000;
		obj.ram = 16;
		obj.rom = 1024;
		obj.processor = "i9";
		obj.type = "Gaming";
		obj.displayLaptop();
	}
}