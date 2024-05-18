class EvenOddRecursion
{
	static int num = 1;
	public static void main(String[] args) {
		EvenNumbers();
	}
	public static void EvenNumbers(){
		if(num%2==0){
			System.out.println(num+" is Even.");
		}
		num++;
		if(num>100)
			return;
		EvenNumbers();
	}
}