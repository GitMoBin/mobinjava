class Bottle
{
	double price=4.5;
	String color = "Black";
	String brand = "Milton";
	double capacity = 1.0;
	String type = "Steel";
	public static void main(String[] args) 
	{
		Bottle obj = new Bottle();
		System.out.println(obj.price);
		System.out.println(obj.color);
		System.out.println(obj.brand);
		System.out.println(obj.capacity);
		System.out.println(obj.type);
		obj.storeWater();
		obj.drinkWater();
		obj.throwWater();
	}
	public void storeWater()
	{

	}
	public void drinkWater()
	{

	}	
	public void throwWater()
	{

	}
}