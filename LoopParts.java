class LoopParts
{
	public static void main(String[] args) {
		
		for(char ch ='A';ch<='Z';ch++)
		{
			System.out.print(ch+" ");
		}

	System.out.println("---------------------------------------");
		for(char ch = 'a'; ch<='z'; ch++)
		{
			System.out.print(ch+" ");
		}

	System.out.println("--------------------------------------");
		for(char ch='0'; ch<='9'; ch++)
		{
			System.out.print(ch+" ");
		}

	System.out.println("--------------------------------------");
		for(char ch='Z';ch>='A';ch--)
		{
			System.out.print(ch+" ");
		}

	System.out.println("--------------------------------------");
		for(char ch='z'; ch>='a'; ch--)
		{
			System.out.print(ch+" ");
		}


	System.out.println("--------------------------------------");
		for(char ch='9'; ch>='0'; ch--)
		{
			System.out.print(ch+" ");
		}
	}
}