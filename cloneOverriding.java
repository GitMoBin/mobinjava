class Human implements Cloneable
{
	String name;
	String place;
	String gender;
	String profession;
	Human(String name, String place, String gender, String profession)
	{
		this.name = name;
		this.place =place;
		this.gender = gender;
		this.profession = profession;
	}
	public String toString()
	{
		return this.name+","+this.place+","+this.gender+","+this.profession;
	}
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
class cloneOverriding
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Human obj1 = new Human("Ramesh","Pune","Male","Engineer");
		System.out.println(obj1);

		Human obj2 = (Human)obj1.clone();
		System.out.println(obj2);

		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}
}