public class StaticDemo3
{
	static
	{
		System.out.println("Static block");
		add();
		System.exit(0);
	}
	static void add()
	{
		int a=10,b=20;
		System.out.println(a+b);
	}
	
	public static void main(String args[])
	{
		System.out.println("main() method");
	}
	
}