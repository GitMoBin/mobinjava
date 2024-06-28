class ArrayLargestElement
{
	public static void main(String[] args) 
	{
		int [] arr = {10,20,30,40,50,60,70,80,90,100};
		int le = 10;

		for(int i=1; i<arr.length; i++)//1<10,2<10,3<10,4<10,5<10,6<10,7<10,8<10,9<10,10<10(False)
		{
			if(le<arr[i])//10<20,20<30,30<40,40<50,50<60,60<70,70<80,80<90,90<100
				le = arr[i];//le=20,le=30,le=40,le=50,le=60,le=70,le=80,le=90,le=100
		}	
		System.out.println("Largest number is : "+le);//100
	}
}