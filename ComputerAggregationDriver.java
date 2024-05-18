class Computer
{
	String brand;
	String model;
	String type;
	int price;
	CPU cpu = new CPU(64,512,"intel core i9","Iris");
	Keyboard keyboard;

	Computer(String brand, String model, String type, int price)
	{
		this.brand = brand;
		this.model = model;
		this.type = type;
		this.price = price;
	}

	public void displayComputer()
	{
		System.out.println();
		System.out.println("**-- COMPUTER'S DETAIL'S --**");
		System.out.println("Brand : "+this.brand);
		System.out.println("Model : "+this.model);
		System.out.println("Type : "+this.type);
		System.out.println("Price : "+this.price);
	}

	public void createInstanceOfKeyboard(String brand, int noOfKeys, String type, String backlight)
	{
		keyboard = new Keyboard(brand,noOfKeys,type,backlight);
	}
}

class CPU
{
	int ram;
	int rom;
	String processor;
	String graphicsCard;

	CPU(int ram, int rom, String processor, String graphicsCard)
	{
		this.ram = ram;
		this.rom = rom;
		this.processor = processor;
		this.graphicsCard = graphicsCard;
	}

	public void displayCPU()
	{
		System.out.println();
		System.out.println("**-- CPU DETAIL'S --**");
		System.out.println("RAM : "+this.ram);
		System.out.println("ROM : "+this.rom);
		System.out.println("Processor : "+this.processor);
		System.out.println("Graphics Card : "+this.graphicsCard);
	}

}

class Keyboard
{
	String brand;
	int noOfKeys;
	String type;
	String backlight;
	Mouse mouse;

	Keyboard(String brand, int noOfKeys, String type, String backlight)
	{
		this.brand = brand;
		this.noOfKeys = noOfKeys;
		this.type = type;
		this.backlight = backlight;
	}

	public void displayKeyboard()
	{
		System.out.println();
		System.out.println("**-- KEYBOARD DETAIL'S --**");
		System.out.println("Brand : "+this.brand);
		System.out.println("No Of keys : "+this.noOfKeys);
		System.out.println("type of Keyboard : "+this.type);
		System.out.println("Backlight : "+this.backlight);
	}

	public void createInstanceOfMouse(String brand, String type, int noOfBottons, Boolean scroll)
	{
		mouse = new Mouse(brand, type, noOfBottons, scroll);
	}
}

class Mouse
{
	String brand;
	String type;
	int noOfBottons;
	Boolean scroll;
	Printer printer;

	Mouse(String brand, String type, int noOfBottons, Boolean scroll)
	{
		this.brand = brand;
		this.type = type;
		this.noOfBottons = noOfBottons;
		this.scroll = scroll;
	}

	public void displayMouse()
	{
		System.out.println();
		System.out.println("**-- MOUSE DETAIL'S --**");
		System.out.println("Brand : "+this.brand);
		System.out.println("Type : "+this.type);
		System.out.println("No Of Bottons : "+this.noOfBottons);
		System.out.println("Scroll : "+this.scroll);
	}

	public void createInstanceOfPrinter(String brand, String type, double price, int capacity)
	{
		printer = new Printer(brand, type, price, capacity);
	}
}

class Printer
{
	String brand;
	String type;
	double price;
	int capacity;
	Speaker speaker;

	Printer(String brand, String type, double price, int capacity)
	{
		this.brand = brand;
		this.type = type;
		this.price = price;
		this.capacity = capacity;
	}

	public void displayPrinter()
	{
		System.out.println();
		System.out.println("**-- PRINTER DETAIL'S --**");
		System.out.println("Brand : "+this.brand);
		System.out.println("type : "+this.type);
		System.out.println("Price : "+this.price);
		System.out.println("capacity : "+this.capacity);
	}
	public void createInstanceOfSpeaker(String brand, int noOfSpeakers, String type, int watt)
	{
		speaker = new Speaker(brand,noOfSpeakers,type,watt);	
	}
}

class Speaker
{
	String brand;
	int noOfSpeakers;
	String type;
	int watt;

	Speaker(String brand, int noOfSpeakers, String type, int watt)
	{
		this.brand = brand;
		this.noOfSpeakers = noOfSpeakers;
		this.type = type;
		this.watt = watt;
	}
	public void displaySpearker()
	{
		System.out.println("**-- SPEAKER'S DETAIL'S --**");
		System.out.println("Brand : "+this.brand);
		System.out.println("No Of Speaker's : "+this.noOfSpeakers);
		System.out.println("Type Of Speaker's : "+this.type);
		System.out.println("Watt Of Speaker's : "+this.watt);
	}

}

class ComputerAggregationDriver
{
	public static void main(String[] args) 
	{
		Computer obj = new Computer("HP","Dual 5s","Chromebook",54000);
		obj.displayComputer();
		obj.cpu.displayCPU();
		obj.createInstanceOfKeyboard("HP Keyboard",109,"Wireless","Yes");
		obj.keyboard.displayKeyboard();
		obj.keyboard.createInstanceOfMouse("HP Mouse","Wireless Mouse",3,true);
		obj.keyboard.mouse.displayMouse();
		obj.keyboard.mouse.createInstanceOfPrinter("HP Laptop","Wired Printer",50000,100);
		obj.keyboard.mouse.printer.displayPrinter();
		obj.keyboard.mouse.printer.createInstanceOfSpeaker("JBl",2,"Wired",30);
		obj.keyboard.mouse.printer.speaker.displaySpearker();
		
	}
}