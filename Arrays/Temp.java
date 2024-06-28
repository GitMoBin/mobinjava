import java.util.*;
class Temp
{
	public static void main(String[] args) {
		// int [][][] b= {{{10,20,30}},{{40},{50}},{{60,70,},{80,90},{100,110}}};
		// System.out.println(Arrays.deepToString(b));

		int[][][] a = new int [2][][];
		a[0]=new int [1][2];
		a[1]=new int[1][4];

		a[0][0]=new int[2];
		a[1][0]=new int[4];
		
		
		a[0][0][0]=10;
		a[0][0][1]=20;
		a[1][0][0]=30;
		a[1][0][1]=40;
		a[1][0][2]=50;
		a[1][0][3]=60;

		
		


		System.out.println(Arrays.deepToString(a));	

	}
}