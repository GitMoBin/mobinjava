import java.util.*;
class ArraySecondLargestElement
{
	public static void main(String[] args) 
	{
		int [] arr = {100,1100,780,903,450,1200};
		Arrays.sort(arr);
		// int sle = arr[0];//100

		// for (int i=1; i<arr.length; i++ )//1<6,2<6,3<6,4<6,5<6
		// {
		// 	if(sle<arr[i])//100<1100,1100<780,1100<903,1100<450,1100<1200
		// 		sle=arr[i];//sle=1100,sle=1200
		// }
		// System.out.println(arr[arr.length-2]);
	}
}