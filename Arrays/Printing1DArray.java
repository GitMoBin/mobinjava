import java.util.Arrays;
class Printing1DArray
{
	public static void main(String[] args) 
	{
		int [] arr ={10,20,30,40,50,60};
		int l = arr.length;

		System.out.println("Using for loop");
		for(int i=0; i<l; i++)
			System.out.println(arr[i]);
			
		System.out.println();
		System.out.println("Using while loop");
		int j=0;
		while(j<l){
			System.out.println(arr[j]);
			j++;
		}		

		System.out.println();
		System.out.println("Using do-while loop");
		int k=0;
		do{
			System.out.println(arr[k]);
			k++;
		}while(k<l);

		System.out.println();
		System.out.println("Using for each loop");
		for(int i : arr)
		{
			System.out.println(i);
		}

		System.out.println();
		System.out.println("Using to-String method");
		System.out.println(Arrays.toString(arr));
	}
}