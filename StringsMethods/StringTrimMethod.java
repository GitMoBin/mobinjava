// Trim method is use to remove or trim the white spaces or character space which is present before or after the string.

import java.util.*;
class StringTrimMethod
{
	public static void main(String[] args) 
	{
		String s1 = "     Deccan     Qspiders      ";
		System.out.println(s1.length());
		String newS1 = s1.trim();
		System.out.println(newS1);
		System.out.println(newS1.length());
	}
}