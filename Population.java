class Population
{
	public static void main(String [] args)
	{
		long currentPopulation = 312032486;
		long secondsInYear = 365*24*60*60;
		long birthPerYear = secondsInYear / 7;
		long deathPerYear = secondsInYear / 13;
		long immigrantPerYear = secondsInYear/45;
		long newPopulation = currentPopulation+((birthPerYear - deathPerYear + immigrantPerYear)*5);
		System.out.println("Population after five years is : " +newPopulation);
	}
}