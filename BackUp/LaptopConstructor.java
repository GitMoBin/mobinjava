class LaptopConstructor
{
	String brand;
	double price;
	int ram;
	int rom;
	String processor;

	LaptopConstructor(String brand,double price,int ram,int rom,String processor)
	{
		this.brand = brand;
		this.price = price;
		this.ram = ram;
		this.rom = rom;
		this.processor = processor;

	}

	public static void main(String[] args) 
	{
		LaptopConstructor obj = new LaptopConstructor("HP",5.6,4,512,"i5 dual");

			
	}
}