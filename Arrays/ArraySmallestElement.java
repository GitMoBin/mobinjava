class ArraySmallestElement
{
	public static void main(String[] args) 
	{
		int [] arr = {4,2,6,1,7,3,5};
		int se = arr[0];

		for(int i=1; i<arr.length; i++)
		{
			
			if(se>arr[i])
			{
				se = arr[i];
			}
		}	
		System.out.println(se);
	}
}