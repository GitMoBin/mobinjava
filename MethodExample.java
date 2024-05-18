class MethodExample
{
	public static void main(String[] args) {
		System.out.println("Execution Starts");
		checkEligibility(20);
		checkEvenOdd(44);

		System.out.println("Execution Ends");
	}

	public static void checkEligibility(int age){
		if(age>=18)
		{
			System.out.println("Eligible");
		}else{
			System.out.println("Not Eligible");
		}
	}

	public static void checkEvenOdd(int num){
		if(num%2==0)
		{
			System.out.println(num+" is even.");
		}else{
			System.out.println(num+" is odd.");
		}
	}
}