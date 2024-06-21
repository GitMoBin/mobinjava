import java.util.*;
class StringCharAtMethod
{
	//Declared global static string variable
	static String str = "Ramesh";
	public static void main(String[] args) 
	{
		for(int i=0; i<str.length(); i++)
		{
			System.out.println(userCharAt(i));
		}		
	}
	public static char userCharAt(int indx)
	{
		//Checked weather index value is in range or not 
		//from 0 to length of given string 
		if (indx<0 || indx>=str.length()) 
		{
			//throwing an explicite exeception using throw 
			throw new StringIndexOutOfBoundsException("Wrong Index");	
		}
		//Creating array of char 
		char [] arr = new char[str.length()];
		for (int i=0; i<str.length(); i++ ) 
		{
			arr[i]= str.charAt(i);	
		}
		//returning arr index
		return arr[indx];
	}
}