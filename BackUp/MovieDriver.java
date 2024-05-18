class Movie
{
	String name;
	String produceerName;
	String type;
	double price;
	String actorName;
	int rating;

	Movie(String name, String produceerName, String type, double price, String actorName, int rating)
	{
		this.name = name; 
		this.produceerName = produceerName;
		this.type = type;
		this.price = price;
		this.actorName = actorName;
		this.rating = rating;
	}

	public void displayMovies()
	{
		System.out.println();
		System.out.println("Movie Deatils");
		System.out.println("Movie Name : "+this.name);
		System.out.println("Producer Name : "+this.produceerName);
		System.out.println("Movie Type : "+this.type);
		System.out.println("Movies Price : "+this.price);
		System.out.println("Actore Name : "+this.actorName);
		System.out.println("Movie Rating : "+this.rating);
		
	}
}

class MovieDriver
{
	public static void main(String[] args) 
	{
		Movie obj = new Movie("Pathan","karan","Action",7.2,"SRK",5);
		obj.displayMovies();

	}
}