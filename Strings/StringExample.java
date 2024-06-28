class StringExample
{
	public static void main(String[] args) 
	{
		String kartikGF ="";
		String kartikWife = "Kartrina";

		if(kartikGF.isEmpty())
		{
			try
			{
				throw new StringIndexOutOfBoundsException("Kartik have no GF");
			}
			catch(Exception e)
			{
				e.printStackTrace();
				if(kartikWife.isEmpty())
				{
					System.out.println("Kartik does not have wife");
				}
				else
				{
					System.out.println("Kartik have wife");
				}
			}
		}		
	}
}
