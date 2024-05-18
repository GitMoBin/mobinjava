class DemoExample
{
	public static void main(String[] args) {
		System.out.println("Execution Starts");
		DemoExample1.hi();
	}
}
class DemoExample1
{
	public static void hi(){
		System.out.println("Execution in mid");
		DemoExample2.hello();
	}
}
class DemoExample2
{
	public static void hello(){
		System.out.println("Execution ends");
	}
}