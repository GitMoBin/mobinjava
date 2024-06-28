class Printind2DArray
{
	public static void main(String[] args) {
		int [][] a ={{10,20,30,40},{50,60,70,80,90,100}};

		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)//a[i]- a[0],a[1]
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("Using for-each loop");

		for(int [] i:a)
		{
			for (int j :i) 
			{
				System.out.print(j+" ");		
			}
			System.out.println();
		}
	}
}