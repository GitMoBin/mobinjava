class Example
{
	public static void main(String [] args)
	{
		String name1="Karhtik";
		String name2="Karan";
		String name3="Karim";
		String name4="";
		

		String convertedCaps=name1.toUpperCase();
		System.out.println("1 : "+convertedCaps);

		int length=name3.length();
		System.out.println("2 : "+length);

		char singleCharacter=name1.charAt(2);
		System.out.println("3 : "+singleCharacter);

		String mergerNames=name1.concat(name2);
		System.out.println("4 : "+mergerNames);

		String multipleChar = name2.substring(1,3); // substring(startIndex, lastLength);
		System.out.println("5 : "+multipleChar);

		String character = name2.substring(2,5);
		System.out.println("6 : "+character);

		boolean emptyOrNot=name4.isEmpty();
		System.out.println("7 : "+emptyOrNot);


	}
}