abstract class Arith
{
	abstract int Addition(int num1, int num2);
	abstract int Substraction(int num1, int num2);
	abstract int Multiplication(int num1, int num2);
	abstract int Division(int num1, int num2);
	abstract int Modulus(int num1, int num2);
}

class ArithImp extends Arith
{
	int Addition(int num1, int num2)
	{
		return(num1+num2);
	}
	int Substraction(int num1, int num2)
	{
		return(num1-num2);
	}
	int Multiplication(int num1, int num2)
	{
		return(num1*num2);
	}
	int Division(int num1, int num2)
	{
		return(num1/num2);
	}
	int Modulus(int num1, int num2)
	{
		return(num1%num2);
	}
}
class ArithDriver
{
	public static void main(String[] args) 
	{
		ArithImp obj = new ArithImp();

		System.out.println(obj.Addition(200,100));
		System.out.println(obj.Substraction(200,100));
		System.out.println(obj.Multiplication(200,100));
		System.out.println(obj.Division(200,100));
		System.out.println(obj.Modulus(200,100));	
	}
}