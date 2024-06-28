class StringEqualsIgnoreCaseMethod
{
	public static void main(String[] args) 
	{
		// String a = "KARTIK";
		// String b = "Kartik";
		// if (a.equalsIgnoreCase(b)) {
		// 	System.out.println("True");
		// }else{
		// 	System.out.println("False");	
		// }

		String s = new String("Mobin");
		String s1 = new String("Mobin");
		String s2 = "Shaikh";
		System.out.println("1 : "+s.contentEquals(s1));
		System.out.println("2 : "+s2.contentEquals(s1));
		System.out.println("3 : "+s2.contentEquals(s));
	}
}

// equals method compare state of object when we override equals method
// equals method compare reference of object when we not override equals method