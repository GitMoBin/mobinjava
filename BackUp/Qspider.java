class Qspider
{
	int noOfBatches = 10;
	String branch = "Deccan Pune";
	int noOfTraniers = 15;
	int noOfStudents = 700;
	int noOfcourses = 20;
	
	public void Study()
	{

		System.out.println("Total study hours : 2");

	}
	public void placements()
	{
		System.out.println("Total PLacements each day : 5");

	}
	public void training()
	{
		System.out.println("Total training hours : 6");

	}
	public static void main(String[] args) 
	{
		Qspider obj = new Qspider();
		System.out.println("No of Batches : "+obj.noOfBatches);
		System.out.println("Location : " +obj.branch);
		System.out.println("No of Trainers : " +obj.noOfTraniers);
		System.out.println("No of Students : " +obj.noOfStudents);
		System.out.println("No of courses : " +obj.noOfcourses);
		obj.Study();
		obj.placements();
		obj.training();
		
	}
}